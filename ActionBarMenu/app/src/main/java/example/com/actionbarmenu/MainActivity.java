package example.com.actionbarmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //IDs for the menu options
    private final int ID_MENU_COMPUTER = 1;
    private final int ID_MENU_GAMEPAD = 2;
    private final int ID_MENU_CAMERA = 3;
    private final int ID_MENU_VIDEO = 4;
    private final int ID_MENU_EMAIL = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);      //initializing the activity
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // calling the base class method
        super.onCreateOptionsMenu(menu);

        //the menu option text is defined in resources
        //get the MenuItem reference by adding menu items
        menu.add(Menu.NONE,ID_MENU_COMPUTER,Menu.NONE,R.string.computer);
        menu.add(Menu.NONE,ID_MENU_GAMEPAD,Menu.NONE,R.string.gamepad);
        menu.add(Menu.NONE,ID_MENU_CAMERA,Menu.NONE,R.string.camera);
        menu.add(Menu.NONE,ID_MENU_VIDEO,Menu.NONE,R.string.video);
        menu.add(Menu.NONE,ID_MENU_EMAIL,Menu.NONE,R.string.email);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        //check selected menu item
        if(item.getItemId() == ID_MENU_COMPUTER)
        {
            //On click menu item- display the message using toast
            Toast.makeText(getApplicationContext(), "You have clicked Computer menu", Toast.LENGTH_LONG).show();
            return true;
        }

        if(item.getItemId() == ID_MENU_GAMEPAD)
        {
            //On click menu item- display the message using toast
            Toast.makeText(getApplicationContext(), "You have clicked Gamepad menu", Toast.LENGTH_LONG).show();
            return true;
        }

        if(item.getItemId() == ID_MENU_CAMERA)
        {
            //On click menu item- display the message using toast
            Toast.makeText(getApplicationContext(), "You have clicked Camera menu", Toast.LENGTH_LONG).show();
            return true;
        }

        if(item.getItemId() == ID_MENU_VIDEO)
        {
            //On click menu item- display the message using toast
            Toast.makeText(getApplicationContext(), "You have clicked Video menu", Toast.LENGTH_LONG).show();
            return true;
        }

        if(item.getItemId() == ID_MENU_EMAIL)
        {
            //On click menu item- display the message using toast
            Toast.makeText(getApplicationContext(), "You have clicked Email menu", Toast.LENGTH_LONG).show();
            return true;
        }
        return false;
    }

}

