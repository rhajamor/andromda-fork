// license-header java merge-point
//
// This file can be safely modified. If deleted it will be regenerated.
// Generated by Entity.vsl in andromda-ejb3-cartridge on 08/05/2014 14:24:56.
//
package org.andromda.timetracker.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.andromda.timetracker.vo.TimecardSearchCriteriaVO;

/**
 * Autogenerated POJO EJB3 implementation class for Timecard.
 *
 * Add any manual implementation within this class.  This class will NOT
 * be overwritten with incremental changes.
 *
 * <p>
 * TODO: Model Documentation for org.andromda.timetracker.domain.Timecard
 * </p>
 *
 */

@Entity
@Table(name = "TIMECARD")
// Uncomment to enable entity listener for Timecard
// @javax.persistence.EntityListeners({TimecardListener.class})
// Uncomment to enable caching for Timecard
// @org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.TRANSACTIONAL)
@NamedQuery(name = "Timecard.findAll", query = "SELECT t FROM Timecard AS t")
public class Timecard
    extends TimecardEmbeddable
    implements Comparable<Timecard>
{
    /**
     * The serial version UID of this class required for serialization.
     */
    private static final long serialVersionUID = 7573880213879125840L;

    // --------------- constructors -----------------

    /**
     * Default Timecard constructor
     */
    public Timecard()
    {
        super();
    }

    /**
     * Implementation for the constructor with all POJO attributes except auto incremented identifiers.
     * This method sets all POJO fields defined in this/super class to the
     * values provided by the parameters.
     * @param status 
     * @param startDate 
     * @param comments 
     */
    public Timecard(TimecardStatus status, Date startDate, String comments)
    {
        super(status, startDate, comments);
    }

    /**
     * Constructor with all POJO attribute values and CMR relations.
     *
     * @param status Value for the status property
     * @param startDate Value for the startDate property
     * @param comments Value for the comments property
     * @param submitter Value for the submitter relation role
     * @param approver Value for the approver relation role
     */
    public Timecard(TimecardStatus status, Date startDate, String comments, User submitter, User approver)
    {
        super(status, startDate, comments, submitter, approver);
    }

    // -------------- Entity Methods -----------------

    /**
     * @param criteria 
     * @return null
     */
    @Transient
    public static List findByCriteria(TimecardSearchCriteriaVO criteria)
    {
        // TODO put your implementation here.
        return null;
    }

    // --------------- Lifecycle callbacks -----------------
    /**
     * @see Comparable#compareTo
     */
    @Override
    public int compareTo(Timecard o)
    {
        int cmp = 0;
        if (this.getTimecardId() != null)
        {
            cmp = this.getTimecardId().compareTo(o.getTimecardId());
        }
        else
        {
            if (this.getStatus() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getStatus().compareTo(o.getStatus()));
            }
            if (this.getStartDate() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getStartDate().compareTo(o.getStartDate()));
            }
            if (this.getComments() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getComments().compareTo(o.getComments()));
            }
        }
        return cmp;
    }
}