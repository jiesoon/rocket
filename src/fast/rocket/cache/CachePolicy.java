package fast.rocket.cache;

/**
 * CachePolicy.NOCACHE - This policy will not use any caching, and will execute
 * every request online. Use this policy if your application is dependent on
 * data that is shared between multiple users and always needs to be up to date.
 * 
 * CachePolicy.CACHEONLY - This policy will only retrieve data from the cache,
 * and will not use any network connection. Use this policy in combination with
 * another policy, to allow for quick response times without requiring a network
 * connection for specific operations.
 * 
 * CachePolicy.CACHEFIRST - This policy will first attempt to retrieve data from
 * the cache. If the data has been cached, it will be returned. If the data does
 * not exist in the cache, the data will be retrieved from server Backend and
 * the cache will be updated. Use this policy if your application can display
 * data that change every time often and you still want local updates.
 * 
 * CachePolicy.NETWORKFIRST - This policy will execute the request on the
 * network, and will store the result in the cache. Use this policy if you
 * application wants the latest data but you still want the local cache update
 * every time.
 * 
 * CachePolicy.BOTH - This policy will first attempt to retrieve data from the
 * cache. If the data has been cached, it will be returned. If the data does not
 * exist in the cache or expired, the data will be retrieved from server Backend
 * and the cache will be updated. Use this policy if your application can
 * display data that doesn't change very often but you still want local updates.
 * */

public enum CachePolicy {

	/** The nocache equals network only. */
	NOCACHE, // Get data from network every time and do not cache data.

	/** The cacheonly. */
	CACHEONLY, // Get data only from cache every time.

	/** The cachefirst. */
	CACHEFIRST, // From cache first then network, update cache at last.

	/** The networkfirst. */
	NETWORKFIRST, // From network first and then update cache.

	BOTH // The same as volley, the difference from CACHEFIRST won't get data
			// from network every time only which were expired.
}
