package com.oldschoolminecraft.jp;

import java.io.Serializable;

public class Message implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    public String join;
    public String quit;
    
    public Message()
    {
        this.join = JoinsPlus.instance.config.default_join;
        this.quit = JoinsPlus.instance.config.default_quit;
    }
    
    public Message(String join, String quit)
    {
        this.join = join;
        this.quit = quit;
    }
}
