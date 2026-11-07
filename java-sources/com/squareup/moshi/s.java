package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class s implements Closeable, Flushable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f15484s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String[] f15485t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f15486u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15487v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15488w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15489x;

    public abstract q A();

    public final int E() {
        int i10 = this.f15483r;
        if (i10 != 0) {
            return this.f15484s[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public abstract q F(double d5);

    public abstract q H(long j);

    public abstract q L(Number number);

    public abstract q N(String str);

    public abstract q O(boolean z10);

    public abstract q b();

    public abstract q e();

    public abstract q i();

    public final String n() {
        return p017b7.g.d0(this.f15483r, this.f15484s, this.f15485t, this.f15486u);
    }

    public final void s(Object obj) {
        if (obj instanceof Map) {
            e();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException(key == null ? "Map keys must be non-null" : "Map keys must be of type String: ".concat(key.getClass().getName()));
                }
                w((String) key);
                s(entry.getValue());
            }
            i();
            return;
        }
        if (obj instanceof List) {
            b();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                s(it.next());
            }
            ((q) this).X(1, 2, ']');
            return;
        }
        if (obj instanceof String) {
            N((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            O(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Double) {
            F(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            H(((Long) obj).longValue());
        } else if (obj instanceof Number) {
            L((Number) obj);
        } else {
            if (obj != null) {
                throw new IllegalArgumentException("Unsupported type: ".concat(obj.getClass().getName()));
            }
            A();
        }
    }

    public abstract q w(String str);
}
