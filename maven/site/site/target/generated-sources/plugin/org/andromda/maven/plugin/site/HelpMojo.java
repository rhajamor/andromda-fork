package org.andromda.maven.plugin.site;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * Display help information on andromda-site-plugin.<br/> Call <pre>  mvn andromda-site:help -Ddetail=true -Dgoal=&lt;goal-name&gt;</pre> to display parameter details.
 *
 * @version generated on Wed Mar 16 20:49:05 CET 2016
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

        append( sb, "org.andromda.maven.plugins.site:andromda-site-plugin:3.5-SNAPSHOT", 0 );
        append( sb, "", 0 );

        append( sb, "AndroMDA Site Plugin", 0 );
        append( sb, "A plugin that enhances the maven site plugin to suit AndroMDA\'s modifications. It creates the namespace and profile documentation, copy and unpack site artifacts.", 1 );
        append( sb, "", 0 );

        if ( goal == null || goal.length() <= 0 )
        {
            append( sb, "This plugin has 5 goals:", 0 );
            append( sb, "", 0 );
        }

        if ( goal == null || goal.length() <= 0 || "copy-documentation".equals( goal ) )
        {
            append( sb, "andromda-site:copy-documentation", 0 );
            append( sb, "Goal that copies the required AndroMDA site files to suitable locations preparing for deployment.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "animalQuizOutputDirectory", 2 );
                append( sb, "Path to the destination directory to copy the animal-quiz model", 3 );
                append( sb, "Expression: ${project.reporting.outputDirectory}", 3 );
                append( sb, "", 0 );

                append( sb, "animalQuizSourcePath", 2 );
                append( sb, "Path to the animal-quiz model", 3 );
                append( sb, "Expression: ${basedir}/../samples/animal-quiz/mda/src/main/uml/AnimalQuiz.xml.zip", 3 );
                append( sb, "", 0 );

                append( sb, "carRentalSystemOutputDirectory", 2 );
                append( sb, "Path to the destination directory to copy the car-rental-system model", 3 );
                append( sb, "Expression: ${project.reporting.outputDirectory}", 3 );
                append( sb, "", 0 );

                append( sb, "carRentalSystemSourcePath", 2 );
                append( sb, "Path to the car-rental-system model", 3 );
                append( sb, "Expression: ${basedir}/../samples/car-rental-system/mda/src/main/uml/CarRentalSystem.xml.zip", 3 );
                append( sb, "", 0 );

                append( sb, "documentationOutputDirectory", 2 );
                append( sb, "The documentation output directory used to copy the generated site reporting artifacts", 3 );
                append( sb, "Expression: ${project.reporting.outputDirectory}", 3 );
                append( sb, "", 0 );

                append( sb, "documentationSourceDirectory", 2 );
                append( sb, "The directory containing the documentation site reporting artifacts", 3 );
                append( sb, "Expression: ${project.reporting.outputDirectory}", 3 );
                append( sb, "", 0 );

                append( sb, "mappingsOutputDirectory", 2 );
                append( sb, "Path to the mapping destination directory", 3 );
                append( sb, "Expression: ${project.reporting.outputDirectory}/mappings", 3 );
                append( sb, "", 0 );

                append( sb, "mappingsSourceDirectory", 2 );
                append( sb, "Path to the mapping source directory containing the mappings", 3 );
                append( sb, "Expression: ${basedir}/../andromda-etc/mappings", 3 );
                append( sb, "", 0 );

                append( sb, "projectName (Default: ${project.name})", 2 );
                append( sb, "The name of the project injected from pom.xml. Not used.", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "help".equals( goal ) )
        {
            append( sb, "andromda-site:help", 0 );
            append( sb, "Display help information on andromda-site-plugin.\nCall\n\u00a0\u00a0mvn\u00a0andromda-site:help\u00a0-Ddetail=true\u00a0-Dgoal=<goal-name>\nto display parameter details.", 1 );
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

        if ( goal == null || goal.length() <= 0 || "namespace-xsl".equals( goal ) )
        {
            append( sb, "andromda-site:namespace-xsl", 0 );
            append( sb, "Used to perform the transformation of the namespace XSL document to namespace.xml xdoc format within the site plugin.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "namespaceDocumentPath", 2 );
                append( sb, "Path to the project namespace.xml", 3 );
                append( sb, "Expression: ${basedir}/src/main/resources/META-INF/andromda/namespace.xml", 3 );
                append( sb, "", 0 );

                append( sb, "namespaceOutputPath", 2 );
                append( sb, "Path to the project namespace document output", 3 );
                append( sb, "Expression: ${basedir}/src/site/xdoc/namespace.xml", 3 );
                append( sb, "", 0 );

                append( sb, "namespaceTransformationPath", 2 );
                append( sb, "Not used", 3 );
                append( sb, "Expression: ${basedir}/src/main/resources/META-INF/xsl/namespace.xsl", 3 );
                append( sb, "", 0 );

                append( sb, "projectName (Default: ${project.name})", 2 );
                append( sb, "The name of the project injected from pom.xml", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "profile-xsl".equals( goal ) )
        {
            append( sb, "andromda-site:profile-xsl", 0 );
            append( sb, "Used to perform the transformation of the profile XSL document to profile.xml xdoc format within the site plugin.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "profileDocumentPath", 2 );
                append( sb, "Path to the project profile.xml", 3 );
                append( sb, "Expression: ${basedir}/src/main/resources/META-INF/andromda/profile.xml", 3 );
                append( sb, "", 0 );

                append( sb, "profileOutputPath", 2 );
                append( sb, "Path to the project profile document output", 3 );
                append( sb, "Expression: ${basedir}/src/site/xdoc/profile.xml", 3 );
                append( sb, "", 0 );

                append( sb, "profileTransformationPath", 2 );
                append( sb, "Not used.", 3 );
                append( sb, "Expression: ${basedir}/src/main/resources/META-INF/xsl/profile.xsl", 3 );
                append( sb, "", 0 );

                append( sb, "projectName (Default: ${project.name})", 2 );
                append( sb, "The name of the project injected from pom.xml", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "unpack-documentation".equals( goal ) )
        {
            append( sb, "andromda-site:unpack-documentation", 0 );
            append( sb, "Goal that unpacks the required AndroMDA site zip packages to suitable locations preparing for deployment.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "jmiApiOutputDirectory", 2 );
                append( sb, "Path to the JMI 1.4 API destination extraction directory", 3 );
                append( sb, "Expression: ${basedir}/../../target/site", 3 );
                append( sb, "", 0 );

                append( sb, "jmiApiSourcePath", 2 );
                append( sb, "Path to the JMI 1.4 API zip source", 3 );
                append( sb, "Expression: ${basedir}/src/site/resources/resources/jmi-uml1.4.zip", 3 );
                append( sb, "", 0 );

                append( sb, "projectName (Default: ${project.name})", 2 );
                append( sb, "The name of the project injected from pom.xml. Not used.", 3 );
                append( sb, "", 0 );

                append( sb, "umlDocCarRentalSampleOutputDirectory", 2 );
                append( sb, "Path to the UmlDoc car-rental-sample extraction directory", 3 );
                append( sb, "Expression: ${basedir}/../../target/site", 3 );
                append( sb, "", 0 );

                append( sb, "umlDocCarRentalSampleSourcePath", 2 );
                append( sb, "Path to the UmlDoc car-rental-sample zip source", 3 );
                append( sb, "Expression: ${basedir}/src/site/resources/resources/car-rental-umldoc.zip", 3 );
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
