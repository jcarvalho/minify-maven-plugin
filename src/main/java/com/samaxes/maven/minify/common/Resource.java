package com.samaxes.maven.minify.common;

import java.io.IOException;
import java.io.InputStream;

public interface Resource {

    public InputStream getInputStream() throws IOException;
    
    public String getPath();
    
    public String getName();
    
}
