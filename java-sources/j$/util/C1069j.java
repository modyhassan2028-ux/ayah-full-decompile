package j$.util;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1069j implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = 1978198479659022715L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Map f18178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1069j f18179b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient C1071l f18180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient C1071l f18181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient C1067h f18182e;

    public C1069j(java.util.Map map) {
        this.f18178a = (java.util.Map) Objects.requireNonNull(map);
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.f18179b) {
            size = this.f18178a.size();
        }
        return size;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f18179b) {
            zIsEmpty = this.f18178a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f18179b) {
            zContainsKey = this.f18178a.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f18179b) {
            zContainsValue = this.f18178a.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f18179b) {
            obj2 = this.f18178a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.f18179b) {
            objPut = this.f18178a.put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object objRemove;
        synchronized (this.f18179b) {
            objRemove = this.f18178a.remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.f18179b) {
            this.f18178a.putAll(map);
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.f18179b) {
            this.f18178a.clear();
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1071l c1071l;
        synchronized (this.f18179b) {
            try {
                if (this.f18180c == null) {
                    this.f18180c = new C1071l(this.f18178a.keySet(), this.f18179b);
                }
                c1071l = this.f18180c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1071l;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1071l c1071l;
        synchronized (this.f18179b) {
            try {
                if (this.f18181d == null) {
                    this.f18181d = new C1071l(this.f18178a.entrySet(), this.f18179b);
                }
                c1071l = this.f18181d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1071l;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        C1067h c1067h;
        synchronized (this.f18179b) {
            try {
                if (this.f18182e == null) {
                    this.f18182e = new C1067h(this.f18178a.values(), this.f18179b);
                }
                c1067h = this.f18182e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1067h;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f18179b) {
            zEquals = this.f18178a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f18179b) {
            iHashCode = this.f18178a.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        String string;
        synchronized (this.f18179b) {
            string = this.f18178a.toString();
        }
        return string;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object objA;
        synchronized (this.f18179b) {
            objA = Map.EL.a(this.f18178a, obj, obj2);
        }
        return objA;
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f18179b) {
            Map.EL.forEach(this.f18178a, biConsumer);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f18179b) {
            java.util.Map map = this.f18178a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                j$.util.concurrent.t tVar = new j$.util.concurrent.t(0, concurrentMap, biFunction);
                if (concurrentMap instanceof j$.util.concurrent.u) {
                    ((j$.util.concurrent.u) concurrentMap).forEach(tVar);
                } else {
                    j$.com.android.tools.r8.a.j(concurrentMap, tVar);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objB;
        synchronized (this.f18179b) {
            objB = Map.EL.b(this.f18178a, obj, obj2);
        }
        return objB;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.f18179b) {
            java.util.Map map = this.f18178a;
            zRemove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return zRemove;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        synchronized (this.f18179b) {
            java.util.Map map = this.f18178a;
            zReplace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return zReplace;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        synchronized (this.f18179b) {
            java.util.Map map = this.f18178a;
            objReplace = map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object obj$default$computeIfAbsent;
        Object objApply;
        synchronized (this.f18179b) {
            java.util.Map map = this.f18178a;
            if (map instanceof Map) {
                obj$default$computeIfAbsent = ((Map) map).computeIfAbsent(obj, function);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(function);
                Object obj2 = concurrentMap.get(obj);
                if (obj2 != null || (objApply = function.apply(obj)) == null) {
                    obj$default$computeIfAbsent = obj2;
                } else {
                    obj$default$computeIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
                    if (obj$default$computeIfAbsent == null) {
                        obj$default$computeIfAbsent = objApply;
                    }
                }
            } else {
                obj$default$computeIfAbsent = Map.CC.$default$computeIfAbsent(map, obj, function);
            }
        }
        return obj$default$computeIfAbsent;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object obj$default$computeIfPresent;
        synchronized (this.f18179b) {
            java.util.Map map = this.f18178a;
            if (map instanceof Map) {
                obj$default$computeIfPresent = ((Map) map).computeIfPresent(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                while (true) {
                    Object obj2 = concurrentMap.get(obj);
                    if (obj2 == null) {
                        obj$default$computeIfPresent = null;
                        break;
                    }
                    Object objApply = biFunction.apply(obj, obj2);
                    if (objApply == null) {
                        if (concurrentMap.remove(obj, obj2)) {
                            obj$default$computeIfPresent = objApply;
                            break;
                        }
                    } else if (concurrentMap.replace(obj, obj2, objApply)) {
                        obj$default$computeIfPresent = objApply;
                        break;
                    }
                }
            } else {
                obj$default$computeIfPresent = Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return obj$default$computeIfPresent;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        Object obj$default$compute;
        Object objApply;
        synchronized (this.f18179b) {
            java.util.Map map = this.f18178a;
            if (map instanceof Map) {
                obj$default$compute = ((Map) map).compute(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                loop0: while (true) {
                    Object objPutIfAbsent = concurrentMap.get(obj);
                    while (true) {
                        objApply = biFunction.apply(obj, objPutIfAbsent);
                        if (objApply == null) {
                            if (objPutIfAbsent != null && !concurrentMap.remove(obj, objPutIfAbsent)) {
                                break;
                            }
                            obj$default$compute = null;
                        } else {
                            if (objPutIfAbsent != null) {
                                if (!concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                                    break;
                                }
                                break;
                            }
                            objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
                            if (objPutIfAbsent == null) {
                                break loop0;
                            }
                        }
                        throw th;
                    }
                }
                obj$default$compute = objApply;
            } else {
                obj$default$compute = Map.CC.$default$compute(map, obj, biFunction);
            }
        }
        return obj$default$compute;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        synchronized (this.f18179b) {
            java.util.Map map = this.f18178a;
            if (map instanceof Map) {
                obj2 = ((Map) map).merge(obj, obj2, biFunction);
            } else {
                if (map instanceof ConcurrentMap) {
                    ConcurrentMap concurrentMap = (ConcurrentMap) map;
                    Objects.requireNonNull(biFunction);
                    Objects.requireNonNull(obj2);
                    loop0: while (true) {
                        Object objPutIfAbsent = concurrentMap.get(obj);
                        while (objPutIfAbsent == null) {
                            objPutIfAbsent = concurrentMap.putIfAbsent(obj, obj2);
                            if (objPutIfAbsent == null) {
                                break loop0;
                            }
                        }
                        Object objApply = biFunction.apply(objPutIfAbsent, obj2);
                        if (objApply != null) {
                            if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                                obj2 = objApply;
                                break;
                            }
                        } else if (concurrentMap.remove(obj, objPutIfAbsent)) {
                            obj2 = null;
                            break;
                        }
                        throw th;
                    }
                }
                obj2 = Map.CC.$default$merge(map, obj, obj2, biFunction);
            }
        }
        return obj2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f18179b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
