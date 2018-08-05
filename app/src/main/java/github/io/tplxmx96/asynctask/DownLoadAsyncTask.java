package github.io.tplxmx96.asynctask;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by yuweichen on 2018/7/22.
 */

public class DownLoadAsyncTask extends AsyncTask<String,Integer,byte[]>{
    private ProgressDialog pd;
    private Context context;
    private ImageView iv;

    public DownLoadAsyncTask(Context context,ImageView iv){
        this.context=context;
        this.iv=iv;
    }
    @Override
    protected void onPreExecute() {
        pd=new ProgressDialog(context);
        pd.setTitle("显示进度");
        pd.setMessage("Loading.....");
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        //d点击进度条对话框中的按钮取消AsyncTask
        pd.setButton(ProgressDialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                cancel(true);//cancel(boolean b)如果设置为ture表示取消对其的AsyncTask
            }
        });
        pd.show();
    }

    /**
     * 表示ui线程中调用cancel()方法取消异步任务成功时间回调的方法
     * 注意：如果onCancelled()被回调 这时将不再执行onPostExecute()方法
     */
    @Override
    protected void onCancelled() {
        pd.dismiss();
        Log.i("tag","------onCancellec------异步任务停止了------");

    }

    @Override
    protected byte[] doInBackground(String... params) {
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        try {
            URL url = new URL(params[0]);
            HttpURLConnection conn= (HttpURLConnection) url.openConnection();
            conn.setDoInput(true);
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode=conn.getResponseCode();
            if (responseCode==200){
                InputStream inputStream=conn.getInputStream();
                long totalLength=conn.getContentLength();
                int currentLength=0;
                byte[] data=new byte[1024];
                int temp=0;
                //isCancelled()表示AsyncTask是否被取消当文件没有读取完毕并且AsyncTask没有停止的情况下继续读取
                while ((temp=inputStream.read(data))!=-1 && !isCancelled()){
                    currentLength+=temp;
                    int progress= (int) ((currentLength/(float)totalLength)*100);
                    publishProgress(progress);
                    outputStream.write(data,0,temp);
                    outputStream.flush();
                }
            }
            return null;
        }catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outputStream.toByteArray();
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        pd.setProgress(values[0]);
    }

    @Override
    protected void onPostExecute(byte[] result) {
        if (result!=null && result.length!=0){
            Bitmap bm= BitmapFactory.decodeByteArray(result,0,result.length);
            iv.setImageBitmap(bm);
        }else {
            Toast.makeText(context,"图片下载失败!",Toast.LENGTH_SHORT).show();
        }
        pd.dismiss();
    }
}
