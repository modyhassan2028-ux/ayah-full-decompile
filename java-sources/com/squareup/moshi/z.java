package com.squareup.moshi;

import dev.zacsweers.moshix.sealed.runtime.internal.ObjectJsonAdapter;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15518b;

    public z(ArrayList arrayList) {
        this.f15517a = arrayList;
    }

    public void a(Class cls, ObjectJsonAdapter objectJsonAdapter) {
        ArrayList arrayList = C.f15413e;
        y yVar = new y(cls, objectJsonAdapter);
        int i10 = this.f15518b;
        this.f15518b = i10 + 1;
        this.f15517a.add(i10, yVar);
    }

    public synchronized List b() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.f15517a));
    }

    public z(int i10) {
        switch (i10) {
            case 2:
                this.f15517a = new ArrayList();
                this.f15518b = 128;
                break;
            default:
                this.f15517a = new ArrayList();
                this.f15518b = 0;
                break;
        }
    }
}
