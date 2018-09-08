package io.github.glytching.tranquil.context;

import io.github.glytching.tranquil.mapping.TypeRef;

public interface ReadContext {

  /**
   * Reads from this context, applying the given {@code select} and {@code where}.
   *
   * @param select projections expressed using our SQL-esque grammar
   * @param where predicates expressed using our SQL-esque grammar
   * @return result the projected and/or predicated results as a string
   */
  String read(String select, String where);

  /**
   * Reads from this context, applying the given {@code select} and {@code where}.
   *
   * @param select projections expressed using our SQL-esque grammar
   * @param where predicates expressed using our SQL-esque grammar
   * @param type the type to which the output should be converted
   * @param <T> the output type
   * @return result the projected and/or predicated results expressed as an instance of {@code type}
   */
  <T> T read(String select, String where, Class<T> type);

  /**
   * Reads from this context, applying the given {@code select} and {@code where}.
   *
   * @param select projections expressed using our SQL-esque grammar
   * @param where predicates expressed using our SQL-esque grammar
   * @param type a wrapper for the type to which the output should be converted
   * @param <T> the output type
   * @return result the projected and/or predicated results expressed as an instance of {@code
   *     type}'s inner type
   */
  <T> T read(String select, String where, TypeRef<T> type);
}
