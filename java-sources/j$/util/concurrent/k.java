package j$.util.concurrent;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f18104c;

    public k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f18102a = obj;
        this.f18103b = obj2;
        this.f18104c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18102a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18103b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f18102a.hashCode() ^ this.f18103b.hashCode();
    }

    public final String toString() {
        return j$.com.android.tools.r8.a.J(this.f18102a, this.f18103b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f18102a;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f18103b;
        return value == obj3 || value.equals(obj3);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f18103b;
        this.f18103b = obj;
        this.f18104c.put(this.f18102a, obj);
        return obj2;
    }
}
