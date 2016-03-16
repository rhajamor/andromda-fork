// license-header java merge-point
//
// Generated by SessionBeanImpl.vsl in andromda-ejb3-cartridge on 08/06/2014 10:56:22.
// Modify as necessary. If deleted it will be regenerated.
//
package org.andromda.demo.ejb3.bicycle;

import java.util.Collection;

/**
 * @see BicycleServiceBase
 *
 * Remember to manually configure the local business interface this bean implements if originally you only
 * defined the remote business interface.  However, this change is automatically reflected in the ejb-jar.xml.
 *
 * Do not specify the javax.ejb.Stateless annotation
 * Instead, the session bean is defined in the ejb-jar.xml descriptor.
 */
// Uncomment to enable webservices for BicycleServiceBean
// @javax.jws.WebService(endpointInterface = "org.andromda.demo.ejb3.bicycle.BicycleServiceWSInterface", serviceName = "BicycleService")
public class BicycleServiceBean
    extends BicycleServiceBase
    implements BicycleServiceRemote
{
    // --------------- Constructors ---------------

    /**
     * Default constructor extending base class default constructor
     */
    public BicycleServiceBean()
    {
        super();
    }

    // -------- Business Methods Impl --------------

    /**
     * @see BicycleServiceBase#addBicycle(Bicycle)
     */
    @Override
    protected void handleAddBicycle(Bicycle bicycle)
        throws Exception
    {
        getBicycleDao().create(bicycle);
    }

    /**
     * @see BicycleServiceBase#getBicycle(long)
     */
    @Override
    protected Bicycle handleGetBicycle(long id)
        throws Exception
    {
        return getBicycleDao().load(id);
    }

    /**
     * @see BicycleServiceBase#getAllBicycles()
     */
    @Override
    protected Collection handleGetAllBicycles()
        throws Exception
    {
        return getBicycleDao().loadAll();
    }

    // -------- Lifecycle Callback Implementation --------------
}