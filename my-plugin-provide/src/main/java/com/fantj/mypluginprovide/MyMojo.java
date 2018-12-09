package com.fantj.mypluginprovide;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

@Mojo(name = "fantj",defaultPhase = LifecyclePhase.PACKAGE)
public class MyMojo extends AbstractMojo {

    @Parameter
    private String msg;

    @Parameter
    private List<String> list;

    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("hello plugin: "+msg + "  list: "+ list);
    }
}
