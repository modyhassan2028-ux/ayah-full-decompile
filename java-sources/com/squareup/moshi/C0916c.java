package com.squareup.moshi;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.squareup.moshi.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0916c extends AbstractC0918e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f15437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f15439c;

    public C0916c(Method method, Object obj, Class cls) {
        this.f15437a = method;
        this.f15438b = obj;
        this.f15439c = cls;
    }

    @Override // com.squareup.moshi.AbstractC0918e
    public final Object a() {
        return this.f15437a.invoke(this.f15438b, this.f15439c);
    }

    public final String toString() {
        return this.f15439c.getName();
    }
}
