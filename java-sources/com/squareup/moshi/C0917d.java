package com.squareup.moshi;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.squareup.moshi.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0917d extends AbstractC0918e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f15440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f15441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15442c;

    public C0917d(Method method, Class cls, int i10) {
        this.f15440a = method;
        this.f15441b = cls;
        this.f15442c = i10;
    }

    @Override // com.squareup.moshi.AbstractC0918e
    public final Object a() {
        return this.f15440a.invoke(null, this.f15441b, Integer.valueOf(this.f15442c));
    }

    public final String toString() {
        return this.f15441b.getName();
    }
}
