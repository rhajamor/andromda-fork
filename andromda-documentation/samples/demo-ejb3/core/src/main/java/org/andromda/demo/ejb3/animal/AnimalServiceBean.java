// license-header java merge-point
//
// Generated by SessionBeanImpl.vsl in andromda-ejb3-cartridge on 08/06/2014 10:56:22.
// Modify as necessary. If deleted it will be regenerated.
//
package org.andromda.demo.ejb3.animal;

import java.util.Collection;

/**
 * @see AnimalServiceBase
 *
 * Remember to manually configure the local business interface this bean implements if originally you only
 * defined the remote business interface.  However, this change is automatically reflected in the ejb-jar.xml.
 *
 * Do not specify the javax.ejb.Stateless annotation
 * Instead, the session bean is defined in the ejb-jar.xml descriptor.
 */
// Uncomment to enable webservices for AnimalServiceBean
// @javax.jws.WebService(endpointInterface = "org.andromda.demo.ejb3.animal.AnimalServiceWSInterface", serviceName = "AnimalService")
public class AnimalServiceBean
    extends AnimalServiceBase
    implements AnimalServiceRemote
{
    // --------------- Constructors ---------------

    /**
     * Default constructor extending base class default constructor
     */
    public AnimalServiceBean()
    {
        super();
    }

    // -------- Business Methods Impl --------------

    /**
     * @see AnimalServiceBase#addAnimal(Animal)
     */
    @Override
    protected void handleAddAnimal(Animal animal)
        throws Exception
    {
        getAnimalDao().create(animal);
    }

    /**
     * @see AnimalServiceBase#getAllAnimals()
     */
    @Override
    protected Collection handleGetAllAnimals()
        throws Exception
    {
        return getAnimalDao().loadAll();
    }

    // -------- Lifecycle Callback Implementation --------------

    /**
     * @see org.andromda.demo.ejb3.animal.AnimalServiceBean#init()
     */
    @Override
    protected void handleInit()
    {
        System.out.println("init...");
    }

    /**
     * @see org.andromda.demo.ejb3.animal.AnimalServiceBean#cleanup()
     */
    @Override
    protected void handleCleanup()
    {
        System.out.println("cleanup...");
    }
}