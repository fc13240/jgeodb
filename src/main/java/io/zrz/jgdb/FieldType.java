package io.zrz.jgdb;

import java.io.IOException;

interface FieldType {

  boolean isNullable();

  Object read(GeoBuffer file) throws IOException;

  Object getDefaultValue();

  <R> R apply(Object object, GeoValueVisitor<R> converter);

}
