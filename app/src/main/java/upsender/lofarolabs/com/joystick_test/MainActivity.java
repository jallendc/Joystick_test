package upsender.lofarolabs.com.joystick_test;

import android.graphics.Paint;
import android.graphics.PointF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.DatagramSocket;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    private static final String host = null;
    private int port;
    String str=null;
    byte[] send_data = new byte[1024];
    byte[] receiveData = new byte[1024];
    Button bt_open_port,bt_send_port,bt3,bt4;
    TextView txt0,txt1, txt_touch_x, txt_touch_y;
    EditText txt_ip, txt_port;
    DatagramSocket client_socket = null;
    int mPort = 2362;
    private SparseArray<PointF> mActivePointers;
    boolean pressedUp = false;
    private SurfaceHolder holder;
    Timer t = new Timer();
    Paint paint = new Paint();
    ImageView drawingImageView;

    double slide_left_center_yP, slide_left_center_xP;
    double slide_right_center_yP, slide_right_center_xP;
    double slide_delta_yP, slide_delta_xP;

    double slide_left_center_x = 272.0; double slide_left_center_y = 432.0;
    double slide_right_center_x = 1007.0; double slide_right_center_y = 432.0;
    double slide_delta_x = 70.0; double slide_delta_y = 200.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
