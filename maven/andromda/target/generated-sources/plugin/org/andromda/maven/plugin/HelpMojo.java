package org.andromda.maven.plugin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * Display help information on andromda-maven-plugin.<br/> Call <pre>  mvn andromda:help -Ddetail=true -Dgoal=&lt;goal-name&gt;</pre> to display parameter details.
 *
 * @version generated on Wed Mar 16 20:45:37 CET 2016
 * @author org.apache.maven.tools.plugin.generator.PluginHelpGenerator (version 2.9)
 * @goal help
 * @requiresProject false
 * @threadSafe
 */
public class HelpMojo
    extends AbstractMojo
{
    /**
     * If <code>true</code>, display all settable properties for each goal.
     * 
     * @parameter expression="${detail}" default-value="false"
     */
    private boolean detail;

    /**
     * The name of the goal for which to show help. If unspecified, all goals will be displayed.
     * 
     * @parameter expression="${goal}"
     */
    private java.lang.String goal;

    /**
     * The maximum length of a display line, should be positive.
     * 
     * @parameter expression="${lineLength}" default-value="80"
     */
    private int lineLength;

    /**
     * The number of spaces per indentation level, should be positive.
     * 
     * @parameter expression="${indentSize}" default-value="2"
     */
    private int indentSize;


    /** {@inheritDoc} */
    public void execute()
        throws MojoExecutionException
    {
        if ( lineLength <= 0 )
        {
            getLog().warn( "The parameter 'lineLength' should be positive, using '80' as default." );
            lineLength = 80;
        }
        if ( indentSize <= 0 )
        {
            getLog().warn( "The parameter 'indentSize' should be positive, using '2' as default." );
            indentSize = 2;
        }

        StringBuffer sb = new StringBuffer();

        append( sb, "org.andromda.maven.plugins:andromda-maven-plugin:3.5-SNAPSHOT", 0 );
        append( sb, "", 0 );

        append( sb, "AndroMDA Maven Plugin", 0 );
        append( sb, "A plugin for running AndroMDA\'s model processor.", 1 );
        append( sb, "", 0 );

        if ( goal == null || goal.length() <= 0 )
        {
            append( sb, "This plugin has 5 goals:", 0 );
            append( sb, "", 0 );
        }

        if ( goal == null || goal.length() <= 0 || "export2emf".equals( goal ) )
        {
            append( sb, "andromda:export2emf", 0 );
            append( sb, "Exports the MagicDraw project file to EMF XMI (requires valid MagicDraw installation in MD_HOME, but only if target files are not up-to-date)", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "allowMultipleRuns (Default: false)", 2 );
                append( sb, "Do we allow the code generation to run multiple times? Yes for AndroMDA server, no for all other cases unless overridden. This prevents multiple code generation runs while creating site documentation, generate-sources phase can run more than 8 times for each model when initiated by many of the reporting plugins.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "", 0 );

                append( sb, "configurationUri", 2 );
                append( sb, "This is the URI to the AndroMDA configuration file.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "Expression: file:${project.basedir}/conf/andromda.xml", 3 );
                append( sb, "", 0 );

                append( sb, "magicDrawHome", 2 );
                append( sb, "The home/root directory of the magicdraw installation.", 3 );
                append( sb, "Expression: ${magicDrawHome}", 3 );
                append( sb, "", 0 );

                append( sb, "propertyFiles", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${project.build.filters}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "help".equals( goal ) )
        {
            append( sb, "andromda:help", 0 );
            append( sb, "Display help information on andromda-maven-plugin.\nCall\n\u00a0\u00a0mvn\u00a0andromda:help\u00a0-Ddetail=true\u00a0-Dgoal=<goal-name>\nto display parameter details.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "detail (Default: false)", 2 );
                append( sb, "If true, display all settable properties for each goal.", 3 );
                append( sb, "Expression: ${detail}", 3 );
                append( sb, "", 0 );

                append( sb, "goal", 2 );
                append( sb, "The name of the goal for which to show help. If unspecified, all goals will be displayed.", 3 );
                append( sb, "Expression: ${goal}", 3 );
                append( sb, "", 0 );

                append( sb, "indentSize (Default: 2)", 2 );
                append( sb, "The number of spaces per indentation level, should be positive.", 3 );
                append( sb, "Expression: ${indentSize}", 3 );
                append( sb, "", 0 );

                append( sb, "lineLength (Default: 80)", 2 );
                append( sb, "The maximum length of a display line, should be positive.", 3 );
                append( sb, "Expression: ${lineLength}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "run".equals( goal ) )
        {
            append( sb, "andromda:run", 0 );
            append( sb, "A Maven2 plugin to run AndroMDA.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "allowMultipleRuns (Default: false)", 2 );
                append( sb, "Do we allow the code generation to run multiple times? Yes for AndroMDA server, no for all other cases unless overridden. This prevents multiple code generation runs while creating site documentation, generate-sources phase can run more than 8 times for each model when initiated by many of the reporting plugins.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "", 0 );

                append( sb, "buildSourceDirectory", 2 );
                append( sb, "The directory to which the build source is located (any generated source).", 3 );
                append( sb, "Expression: ${project.build.directory}/src/main/java", 3 );
                append( sb, "", 0 );

                append( sb, "configurationUri", 2 );
                append( sb, "This is the URI to the AndroMDA configuration file.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "Expression: file:${project.basedir}/conf/andromda.xml", 3 );
                append( sb, "", 0 );

                append( sb, "lastModifiedCheck (Default: true)", 2 );
                append( sb, "Whether or not a last modified check should be performed before running AndroMDA again. Checks files in buildSourceDirectory against configurationUri and referenced model dates.", 3 );
                append( sb, "Expression: ${lastModifiedCheck}", 3 );
                append( sb, "", 0 );

                append( sb, "modelOutputHistory", 2 );
                append( sb, "The directory where the model generation output history is located (Modelname file containing a list of files generated by that model).", 3 );
                append( sb, "Expression: ${project.build.directory}/history", 3 );
                append( sb, "", 0 );

                append( sb, "propertyFiles", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${project.build.filters}", 3 );
                append( sb, "", 0 );

                append( sb, "skipProcessing (Default: false)", 2 );
                append( sb, "Whether or not processing should be skipped (this is if you just want to force AndroMDA not to run on your model).", 3 );
                append( sb, "Expression: ${andromda.run.skip}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "start-server".equals( goal ) )
        {
            append( sb, "andromda:start-server", 0 );
            append( sb, "Provides the ability to start the AndroMDA server.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "allowMultipleRuns (Default: false)", 2 );
                append( sb, "Do we allow the code generation to run multiple times? Yes for AndroMDA server, no for all other cases unless overridden. This prevents multiple code generation runs while creating site documentation, generate-sources phase can run more than 8 times for each model when initiated by many of the reporting plugins.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "", 0 );

                append( sb, "configurationUri", 2 );
                append( sb, "This is the URI to the AndroMDA configuration file.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "Expression: file:${project.basedir}/conf/andromda.xml", 3 );
                append( sb, "", 0 );

                append( sb, "propertyFiles", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${project.build.filters}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "stop-server".equals( goal ) )
        {
            append( sb, "andromda:stop-server", 0 );
            append( sb, "Provides the ability to stop the AndroMDA server.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "allowMultipleRuns (Default: false)", 2 );
                append( sb, "Do we allow the code generation to run multiple times? Yes for AndroMDA server, no for all other cases unless overridden. This prevents multiple code generation runs while creating site documentation, generate-sources phase can run more than 8 times for each model when initiated by many of the reporting plugins.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "", 0 );

                append( sb, "configurationUri", 2 );
                append( sb, "This is the URI to the AndroMDA configuration file.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "Expression: file:${project.basedir}/conf/andromda.xml", 3 );
                append( sb, "", 0 );

                append( sb, "propertyFiles", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${project.build.filters}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( getLog().isInfoEnabled() )
        {
            getLog().info( sb.toString() );
        }
    }

    /**
     * <p>Repeat a String <code>n</code> times to form a new string.</p>
     *
     * @param str String to repeat
     * @param repeat number of times to repeat str
     * @return String with repeated String
     * @throws NegativeArraySizeException if <code>repeat < 0</code>
     * @throws NullPointerException if str is <code>null</code>
     */
    private static String repeat( String str, int repeat )
    {
        StringBuffer buffer = new StringBuffer( repeat * str.length() );

        for ( int i = 0; i < repeat; i++ )
        {
            buffer.append( str );
        }

        return buffer.toString();
    }

    /** 
     * Append a description to the buffer by respecting the indentSize and lineLength parameters.
     * <b>Note</b>: The last character is always a new line.
     * 
     * @param sb The buffer to append the description, not <code>null</code>.
     * @param description The description, not <code>null</code>.
     * @param indent The base indentation level of each line, must not be negative.
     */
    private void append( StringBuffer sb, String description, int indent )
    {
        for ( Iterator it = toLines( description, indent, indentSize, lineLength ).iterator(); it.hasNext(); )
        {
            sb.append( it.next().toString() ).append( '\n' );
        }
    }

    /** 
     * Splits the specified text into lines of convenient display length.
     * 
     * @param text The text to split into lines, must not be <code>null</code>.
     * @param indent The base indentation level of each line, must not be negative.
     * @param indentSize The size of each indentation, must not be negative.
     * @param lineLength The length of the line, must not be negative.
     * @return The sequence of display lines, never <code>null</code>.
     * @throws NegativeArraySizeException if <code>indent < 0</code>
     */
    private static List toLines( String text, int indent, int indentSize, int lineLength )
    {
        List lines = new ArrayList();

        String ind = repeat( "\t", indent );
        String[] plainLines = text.split( "(\r\n)|(\r)|(\n)" );
        for ( int i = 0; i < plainLines.length; i++ )
        {
            toLines( lines, ind + plainLines[i], indentSize, lineLength );
        }

        return lines;
    }

    /** 
     * Adds the specified line to the output sequence, performing line wrapping if necessary.
     * 
     * @param lines The sequence of display lines, must not be <code>null</code>.
     * @param line The line to add, must not be <code>null</code>.
     * @param indentSize The size of each indentation, must not be negative.
     * @param lineLength The length of the line, must not be negative.
     */
    private static void toLines( List lines, String line, int indentSize, int lineLength )
    {
        int lineIndent = getIndentLevel( line );
        StringBuffer buf = new StringBuffer( 256 );
        String[] tokens = line.split( " +" );
        for ( int i = 0; i < tokens.length; i++ )
        {
            String token = tokens[i];
            if ( i > 0 )
            {
                if ( buf.length() + token.length() >= lineLength )
                {
                    lines.add( buf.toString() );
                    buf.setLength( 0 );
                    buf.append( repeat( " ", lineIndent * indentSize ) );
                }
                else
                {
                    buf.append( ' ' );
                }
            }
            for ( int j = 0; j < token.length(); j++ )
            {
                char c = token.charAt( j );
                if ( c == '\t' )
                {
                    buf.append( repeat( " ", indentSize - buf.length() % indentSize ) );
                }
                else if ( c == '\u00A0' )
                {
                    buf.append( ' ' );
                }
                else
                {
                    buf.append( c );
                }
            }
        }
        lines.add( buf.toString() );
    }

    /** 
     * Gets the indentation level of the specified line.
     * 
     * @param line The line whose indentation level should be retrieved, must not be <code>null</code>.
     * @return The indentation level of the line.
     */
    private static int getIndentLevel( String line )
    {
        int level = 0;
        for ( int i = 0; i < line.length() && line.charAt( i ) == '\t'; i++ )
        {
            level++;
        }
        for ( int i = level + 1; i <= level + 4 && i < line.length(); i++ )
        {
            if ( line.charAt( i ) == '\t' )
            {
                level++;
                break;
            }
        }
        return level;
    }
}
