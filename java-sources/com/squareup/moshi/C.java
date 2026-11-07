package com.squareup.moshi;

import j$.util.DesugarCollections;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ArrayList f15413e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadLocal f15416c = new ThreadLocal();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f15417d = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        f15413e = arrayList;
        arrayList.add(E.f15419a);
        arrayList.add(CollectionJsonAdapter.FACTORY);
        arrayList.add(MapJsonAdapter.FACTORY);
        arrayList.add(ArrayJsonAdapter.FACTORY);
        arrayList.add(RecordJsonAdapter.FACTORY);
        arrayList.add(ClassJsonAdapter.FACTORY);
    }

    public C(z zVar) {
        ArrayList arrayList = zVar.f15517a;
        int size = arrayList.size();
        ArrayList arrayList2 = f15413e;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.f15414a = DesugarCollections.unmodifiableList(arrayList3);
        this.f15415b = zVar.f15518b;
    }

    public final JsonAdapter a(Class cls) {
        return b(cls, V8.d.f8425a, null);
    }

    public final JsonAdapter b(Type type, Set set, String str) {
        JsonAdapter jsonAdapter;
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeA = V8.d.a(type);
        if (typeA instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) typeA;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length != 1) {
                    throw new IllegalArgumentException();
                }
                typeA = upperBounds[0];
            }
        }
        Object objAsList = set.isEmpty() ? typeA : Arrays.asList(typeA, set);
        synchronized (this.f15417d) {
            try {
                JsonAdapter jsonAdapter2 = (JsonAdapter) this.f15417d.get(objAsList);
                if (jsonAdapter2 != null) {
                    return jsonAdapter2;
                }
                B b5 = (B) this.f15416c.get();
                if (b5 == null) {
                    b5 = new B(this);
                    this.f15416c.set(b5);
                }
                ArrayDeque arrayDeque = b5.f15410b;
                ArrayList arrayList = b5.f15409a;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        A a9 = new A(typeA, str, objAsList);
                        arrayList.add(a9);
                        arrayDeque.add(a9);
                        jsonAdapter = null;
                        break;
                    }
                    A a10 = (A) arrayList.get(i10);
                    if (a10.f15407c.equals(objAsList)) {
                        arrayDeque.add(a10);
                        JsonAdapter jsonAdapter3 = a10.f15408d;
                        jsonAdapter = a10;
                        if (jsonAdapter3 == null) {
                            break;
                        }
                        jsonAdapter = jsonAdapter3;
                        break;
                    }
                    i10++;
                }
                try {
                    if (jsonAdapter != null) {
                        b5.b(false);
                        return jsonAdapter;
                    }
                    try {
                        int size2 = this.f15414a.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            JsonAdapter jsonAdapterA = ((j) this.f15414a.get(i11)).a(typeA, set, this);
                            if (jsonAdapterA != null) {
                                ((A) b5.f15410b.getLast()).f15408d = jsonAdapterA;
                                b5.b(true);
                                return jsonAdapterA;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + V8.d.h(typeA, set));
                    } catch (IllegalArgumentException e10) {
                        throw b5.a(e10);
                    }
                } catch (Throwable th) {
                    b5.b(false);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
