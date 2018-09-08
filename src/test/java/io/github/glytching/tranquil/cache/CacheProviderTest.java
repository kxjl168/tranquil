package io.github.glytching.tranquil.cache;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CacheProviderTest {

  @Test
  public void willProvideASingleCacheInstance() {
    Cache cache = CacheProvider.get(1);

    assertThat(cache, notNullValue());
    assertThat(cache, instanceOf(LRUCache.class));
    assertThat(cache, sameInstance(CacheProvider.get(1)));
  }
}
