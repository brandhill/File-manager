package com.mitsw.filemanager;

import android.content.Intent;
import android.net.Uri;
import greendroid.app.GDApplication;

public class GDActionBarExampleApplication extends GDApplication {
	
    @Override
    public Class<?> getHomeActivityClass() {
        return Main.class;
    }
    


}