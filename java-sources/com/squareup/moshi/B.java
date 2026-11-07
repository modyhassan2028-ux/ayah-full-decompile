package com.squareup.moshi;

import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15409a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f15410b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C f15412d;

    public B(C c10) {
        this.f15412d = c10;
    }

    public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        if (!this.f15411c) {
            this.f15411c = true;
            ArrayDeque arrayDeque = this.f15410b;
            if (arrayDeque.size() != 1 || ((A) arrayDeque.getFirst()).f15406b != null) {
                StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    A a9 = (A) itDescendingIterator.next();
                    sb.append("\nfor ");
                    Type type = a9.f15405a;
                    String str = a9.f15406b;
                    sb.append(type);
                    if (str != null) {
                        sb.append(' ');
                        sb.append(str);
                    }
                }
                return new IllegalArgumentException(sb.toString(), illegalArgumentException);
            }
        }
        return illegalArgumentException;
    }

    public final void b(boolean z10) {
        this.f15410b.removeLast();
        if (this.f15410b.isEmpty()) {
            this.f15412d.f15416c.remove();
            if (z10) {
                synchronized (this.f15412d.f15417d) {
                    try {
                        int size = this.f15409a.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            A a9 = (A) this.f15409a.get(i10);
                            JsonAdapter jsonAdapter = (JsonAdapter) this.f15412d.f15417d.put(a9.f15407c, a9.f15408d);
                            if (jsonAdapter != null) {
                                a9.f15408d = jsonAdapter;
                                this.f15412d.f15417d.put(a9.f15407c, jsonAdapter);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
