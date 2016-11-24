package Object_Pool.example;

import java.util.Hashtable;

/**
 * The ObjectPool Class
 *
 * @author malex
 */
abstract class ObjectPool<T> {

    private long expirationTime;

    private Hashtable<T, Long> locked;

    private Hashtable<T, Long> unlocked;

    ObjectPool() {
        
        // Object lifetime = 30 seconds
        expirationTime = 30000;

        // Hashtable for locked objects
        locked = new Hashtable<T, Long>();

        // Hashtable for unlocked objects
        unlocked = new Hashtable<T, Long>();
    }

    protected abstract T create();

    public abstract boolean validate(T o);

    public abstract void expire(T o);



    // Return the T
    public synchronized void checkIn(T t) {
        // Delete from
        locked.remove(t);

        unlocked.put(t, System.currentTimeMillis());
    }

}
