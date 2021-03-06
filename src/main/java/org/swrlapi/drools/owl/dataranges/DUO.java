package org.swrlapi.drools.owl.dataranges;

import checkers.nullness.quals.NonNull;

import java.util.Set;

/**
 * Class representing an OWL data union of data range
 *
 * @see org.semanticweb.owlapi.model.OWLDataUnionOf
 */
public class DUO implements DR
{
  private static final long serialVersionUID = 1L;

  @NonNull private final String rid;
  @NonNull private final Set<String> dataRangeIDs;

  public DUO(@NonNull String rid, @NonNull Set<String> dataRangeIDs)
  {
    this.rid = rid;
    this.dataRangeIDs = dataRangeIDs;
  }

  @NonNull @Override
  public String getrid()
  {
    return this.rid;
  }

  @NonNull public Set<String> getDataRangeIDs()
  {
    return this.dataRangeIDs;
  }
}
