// license-header java merge-point
//
// Generated by SessionBeanImpl.vsl in andromda-ejb3-cartridge on 08/06/2014 10:56:22.
// Modify as necessary. If deleted it will be regenerated.
//
package org.andromda.demo.ejb3.account;

/**
 * @see AccountManagerBase
 *
 * Remember to manually configure the local business interface this bean implements if originally you only
 * defined the remote business interface.  However, this change is automatically reflected in the ejb-jar.xml.
 *
 * Do not specify the javax.ejb.Stateless annotation
 * Instead, the session bean is defined in the ejb-jar.xml descriptor.
 */
// Uncomment to enable webservices for AccountManagerBean
// @javax.jws.WebService(endpointInterface = "org.andromda.demo.ejb3.account.AccountManagerWSInterface", serviceName = "AccountManager")
public class AccountManagerBean
    extends AccountManagerBase
    implements AccountManagerRemote
{
    // --------------- Constructors ---------------

    /**
     * Default constructor extending base class default constructor
     */
    public AccountManagerBean()
    {
        super();
    }

    // -------- Business Methods Impl --------------

    /**
     * @see AccountManagerBase#addAccount(Account)
     */
    @Override
    protected long handleAddAccount(Account account)
        throws Exception
    {
        getAccountDao().create(account);
        return account.getId();
    }

    /**
     * @see AccountManagerBase#getAccount(long)
     */
    @Override
    protected Account handleGetAccount(long id)
        throws Exception
    {
        return getAccountDao().load(id);
    }

    /**
     * @see AccountManagerBase#deleteAccount(long)
     */
    @Override
    protected void handleDeleteAccount(long id)
        throws Exception
    {
        getAccountDao().remove(id);
    }

    // -------- Lifecycle Callback Implementation --------------
}