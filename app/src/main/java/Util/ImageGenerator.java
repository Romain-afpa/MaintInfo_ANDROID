package Util;

import com.maintinfo.maintinfo_android_v2.R;

import java.util.Random;

/**
 * Created by Romain on 02/03/2016.
 */
public class ImageGenerator {

    private String[] images = {};

    public static int randomImage(){

        int random = new Random().nextInt(6);
    int image;
        switch(random){

            case 0:
                image = R.drawable.ic_1456947586_mouse;
                break;
            case 1:
                image = R.drawable.ic_1456947649_floppy_disk;
                break;
            case 2:
                image = R.drawable.ic_1456947679_desktop_monitor_screen;
                break;

            case 3:
                image = R.drawable.ic_1456947688_shared_folder_network;
                break;
            case 4:
                image = R.drawable.ic_1456947694_modem;
                break;
            case 5:
                image = R.drawable.ic_1456947703_satelite;
                break;
            case 6:
                image = R.drawable.ic_1456947716_cloud;
                break;
            default:
                image = R.drawable.ic_1456947688_shared_folder_network;
                break;
        }
        return image;
    }
}
