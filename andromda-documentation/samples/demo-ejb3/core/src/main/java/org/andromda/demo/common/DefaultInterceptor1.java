// license-header java merge-point
// Generated by Interceptor.vsl in andromda-ejb3-cartridge on 08/06/2014 10:56:25.
package org.andromda.demo.common;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 * Interceptor class DefaultInterceptor1
 */
public class DefaultInterceptor1
{
    /**
     * Default interceptor execution method
     *
     * @param ctx the invocation context
     * @return
     */
    @AroundInvoke
    public Object execute(InvocationContext ctx)
        throws Exception
    {
        System.out.println("Default interceptor1");

        try
        {
            return ctx.proceed();
        }
        catch (Exception e)
        {
            throw e;
        }
    }
}