package org.andromda.maven.plugin.andromdapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * Display help information on andromdapp-maven-plugin.<br/> Call <pre>  mvn andromdapp:help -Ddetail=true -Dgoal=&lt;goal-name&gt;</pre> to display parameter details.
 *
 * @version generated on Wed Mar 16 20:46:06 CET 2016
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

        append( sb, "org.andromda.maven.plugins:andromdapp-maven-plugin:3.5-SNAPSHOT", 0 );
        append( sb, "", 0 );

        append( sb, "AndroMDA Application Generator Maven Plugin", 0 );
        append( sb, "A plugin for running AndroMDA\'s AndroMDApp application generator to generate Maven2 AndroMDA powered applications.", 1 );
        append( sb, "", 0 );

        if ( goal == null || goal.length() <= 0 )
        {
            append( sb, "This plugin has 10 goals:", 0 );
            append( sb, "", 0 );
        }

        if ( goal == null || goal.length() <= 0 || "build".equals( goal ) )
        {
            append( sb, "andromdapp:build", 0 );
            append( sb, "A Mojo used for executing the build goals from the top level project.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "baseDirectory", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${project.basedir}", 3 );
                append( sb, "", 0 );

                append( sb, "environmentVariablePrefix", 2 );
                append( sb, "The prefix environment variables must have.", 3 );
                append( sb, "Expression: env.", 3 );
                append( sb, "", 0 );

                append( sb, "executionProperties", 2 );
                append( sb, "Any execution properties.", 3 );
                append( sb, "", 0 );

                append( sb, "goals", 2 );
                append( sb, "The default module goals to execute.", 3 );
                append( sb, "", 0 );

                append( sb, "modules", 2 );
                append( sb, "A comma separated list of modules to execute in the form: -Dmodules=mda,core,common or if you want to specify the goals to execute as well: -Dmodules=mda:[goal1+goal2+goal3],core:[goal1].", 3 );
                append( sb, "Expression: ${modules}", 3 );
                append( sb, "", 0 );

                append( sb, "session", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${session}", 3 );
                append( sb, "", 0 );

                append( sb, "startConsole", 2 );
                append( sb, "If defined starts the build console (i.e. keeps maven loaded and running)", 3 );
                append( sb, "Expression: ${console}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "clean-structure".equals( goal ) )
        {
            append( sb, "andromdapp:clean-structure", 0 );
            append( sb, "Removes the an AndroMDApp generated application structure.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "configurationUri", 2 );
                append( sb, "The URI to an optional AndroMDApp configuration file.", 3 );
                append( sb, "Expression: ${configuration.uri}", 3 );
                append( sb, "", 0 );

                append( sb, "propertyFiles", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${project.build.filters}", 3 );
                append( sb, "", 0 );

                append( sb, "skip", 2 );
                append( sb, "Set this to \'true\' to bypass cartridge tests entirely. Its use is NOT RECOMMENDED, but quite convenient on occasion.", 3 );
                append( sb, "Expression: ${maven.test.skip}", 3 );
                append( sb, "", 0 );

                append( sb, "skipProcessing", 2 );
                append( sb, "Whether or not processing should be skipped (this is if you want to completely skip code generation, i.e. if code is already generated and you are creating the site from already generated source code).", 3 );
                append( sb, "Expression: ${andromdapp.run.skip}", 3 );
                append( sb, "", 0 );

                append( sb, "skipTests", 2 );
                append( sb, "Set this to \'true\' to skip running tests, but still compile them. Its use is NOT RECOMMENDED, but quite convenient on occasion.", 3 );
                append( sb, "Expression: ${skipTests}", 3 );
                append( sb, "", 0 );

                append( sb, "testFailureIgnore (Default: false)", 2 );
                append( sb, "Set this to true to ignore a failure during testing. Its use is NOT RECOMMENDED, but quite convenient on occasion.", 3 );
                append( sb, "Expression: ${maven.test.failure.ignore}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "deploy".equals( goal ) )
        {
            append( sb, "andromdapp:deploy", 0 );
            append( sb, "Provides the deployment of applications to a given directory.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "deploy", 2 );
                append( sb, "Indicates whether or not this plugin should perform the deploy.", 3 );
                append( sb, "Expression: ${deploy}", 3 );
                append( sb, "", 0 );

                append( sb, "deployLocation", 2 );
                append( sb, "The location (i.e. path) to deploy.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "", 0 );

                append( sb, "excludes", 2 );
                append( sb, "Any files to exclude in the deploy.", 3 );
                append( sb, "", 0 );

                append( sb, "includes", 2 );
                append( sb, "Any additional files to include in the deploy liked datasource files etc (the files must reside in the project build directory). By default nothing besides the file artifact is deployed.", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "eclipse".equals( goal ) )
        {
            append( sb, "andromdapp:eclipse", 0 );
            append( sb, "Writes the necessary .classpath and .project files for a new eclipse application.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "classpathArtifactTypes", 2 );
                append( sb, "The artifact types which should be included in the generated Eclipse classpath.", 3 );
                append( sb, "", 0 );

                append( sb, "classpathMerge", 2 );
                append( sb, "Allows non-generated configuration to be \'merged\' into the generated .classpath file.", 3 );
                append( sb, "", 0 );

                append( sb, "excludePoms", 2 );
                append( sb, "Defines the POMs to exclude when generating the eclipse files.", 3 );
                append( sb, "Expression: ${exclude.poms}", 3 );
                append( sb, "", 0 );

                append( sb, "excludes", 2 );
                append( sb, "Defines the POMs to exclude when generating the eclipse files.", 3 );
                append( sb, "", 0 );

                append( sb, "includes", 2 );
                append( sb, "Defines the POMs to include when generating the eclipse files.", 3 );
                append( sb, "", 0 );

                append( sb, "repositoryVariableName", 2 );
                append( sb, "The name of the variable that will store the maven repository location.", 3 );
                append( sb, "Expression: ${repository.variable.name}", 3 );
                append( sb, "", 0 );

                append( sb, "resolveTransitiveDependencies", 2 );
                append( sb, "Whether or not transitive dependencies shall be included in any resources (i.e. .classpath that are generated by this mojo).", 3 );
                append( sb, "Expression: ${resolveTransitiveDependencies}", 3 );
                append( sb, "", 0 );

                append( sb, "session", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${session}", 3 );
                append( sb, "", 0 );

                append( sb, "skipProcessing", 2 );
                append( sb, "Whether or not processing should be skipped (this is if you just want to force AndroMDA not to run on your model).", 3 );
                append( sb, "Expression: ${andromda.run.skip}", 3 );
                append( sb, "", 0 );

                append( sb, "variables", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "generate".equals( goal ) )
        {
            append( sb, "andromdapp:generate", 0 );
            append( sb, "AndroMDA application generator Mojo.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "configurationUri", 2 );
                append( sb, "The URI to an optional AndroMDApp configuration file.", 3 );
                append( sb, "Expression: ${configuration.uri}", 3 );
                append( sb, "", 0 );

                append( sb, "propertyFiles", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${project.build.filters}", 3 );
                append( sb, "", 0 );

                append( sb, "skip", 2 );
                append( sb, "Set this to \'true\' to bypass cartridge tests entirely. Its use is NOT RECOMMENDED, but quite convenient on occasion.", 3 );
                append( sb, "Expression: ${maven.test.skip}", 3 );
                append( sb, "", 0 );

                append( sb, "skipProcessing", 2 );
                append( sb, "Whether or not processing should be skipped (this is if you want to completely skip code generation, i.e. if code is already generated and you are creating the site from already generated source code).", 3 );
                append( sb, "Expression: ${andromdapp.run.skip}", 3 );
                append( sb, "", 0 );

                append( sb, "skipTests", 2 );
                append( sb, "Set this to \'true\' to skip running tests, but still compile them. Its use is NOT RECOMMENDED, but quite convenient on occasion.", 3 );
                append( sb, "Expression: ${skipTests}", 3 );
                append( sb, "", 0 );

                append( sb, "testFailureIgnore (Default: false)", 2 );
                append( sb, "Set this to true to ignore a failure during testing. Its use is NOT RECOMMENDED, but quite convenient on occasion.", 3 );
                append( sb, "Expression: ${maven.test.failure.ignore}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "help".equals( goal ) )
        {
            append( sb, "andromdapp:help", 0 );
            append( sb, "Display help information on andromdapp-maven-plugin.\nCall\n\u00a0\u00a0mvn\u00a0andromdapp:help\u00a0-Ddetail=true\u00a0-Dgoal=<goal-name>\nto display parameter details.", 1 );
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

        if ( goal == null || goal.length() <= 0 || "instrument-scripts".equals( goal ) )
        {
            append( sb, "andromdapp:instrument-scripts", 0 );
            append( sb, "Allows for the ScriptClassGenerator mojo to be invoked. on one or more given classes.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "locations", 2 );
                append( sb, "Defines the java files who\'s classes will be instrumented.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "", 0 );

                append( sb, "scriptWrapper", 2 );
                append( sb, "Defines the fully qualified class name of the script wrapper implementation.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "link".equals( goal ) )
        {
            append( sb, "andromdapp:link", 0 );
            append( sb, "Basically post processes a previously built ear and replaces any war artifacts with symbolic links and then symbolic links the ear to the deploy directory so that we don\'t have to redeploy an ear in order to make jsp changes.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "deployLocation", 2 );
                append( sb, "The location in which to link the exploded ear.", 3 );
                append( sb, "Expression: ${env.JBOSS_HOME}/server/default/deploy", 3 );
                append( sb, "", 0 );

                append( sb, "rootProjectLimit", 2 );
                append( sb, "The number of levels allowed to travel up before we get to the \'root project\' (i.e. this will prevent the system from attempting to get parent project that aren\'t really part of the direct project).", 3 );
                append( sb, "Expression: 1", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "schema".equals( goal ) )
        {
            append( sb, "andromdapp:schema", 0 );
            append( sb, "Provides the ability to drop database schemas.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "executeScripts", 2 );
                append( sb, "Whether or not scripts should be executed (if this is set to false, they will only be generated, but not executed).", 3 );
                append( sb, "Expression: ${executeScripts}", 3 );
                append( sb, "", 0 );

                append( sb, "jdbcConnectionUrl", 2 );
                append( sb, "The JDBC connection URL.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "", 0 );

                append( sb, "jdbcDriver", 2 );
                append( sb, "The name of the JDBC driver class.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "", 0 );

                append( sb, "jdbcDriverJar", 2 );
                append( sb, "The jar containing the JDBC driver.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "", 0 );

                append( sb, "jdbcPassword", 2 );
                append( sb, "The JDBC password for the database.", 3 );
                append( sb, "", 0 );

                append( sb, "jdbcUsername", 2 );
                append( sb, "The JDBC username for the database.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "", 0 );

                append( sb, "pluginArtifacts", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "Expression: ${plugin.artifacts}", 3 );
                append( sb, "", 0 );

                append( sb, "properties", 2 );
                append( sb, "The properties that can be passed to the schema task.", 3 );
                append( sb, "", 0 );

                append( sb, "propertyFiles", 2 );
                append( sb, "Any property files that should be loaded into the schema properties.", 3 );
                append( sb, "", 0 );

                append( sb, "scripts", 2 );
                append( sb, "Defines the location(s) of any SQL scripts to be executed.", 3 );
                append( sb, "", 0 );

                append( sb, "tasks", 2 );
                append( sb, "The schema task to execute (create, drop, update, validate)", 3 );
                append( sb, "Expression: ${tasks}", 3 );
                append( sb, "", 0 );

                append( sb, "taskType", 2 );
                append( sb, "The type of the create schema task to execute.", 3 );
                append( sb, "Required: Yes", 3 );
                append( sb, "Expression: hibernate", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "undeploy".equals( goal ) )
        {
            append( sb, "andromdapp:undeploy", 0 );
            append( sb, "Provides the undeployment of applications from a given directory.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "deployLocation", 2 );
                append( sb, "The location (i.e. path) to deploy.", 3 );
                append( sb, "Required: Yes", 3 );
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
