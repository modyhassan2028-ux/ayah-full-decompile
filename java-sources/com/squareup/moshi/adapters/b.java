package com.squareup.moshi.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import com.squareup.moshi.s;

/* JADX INFO: loaded from: classes.dex */
public final class b extends JsonAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f15430b;

    public b(c cVar, Object obj) {
        this.f15430b = cVar;
        this.f15429a = obj;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        nVar.c0();
        return this.f15429a;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        throw new IllegalArgumentException("Expected one of " + this.f15430b.f15432b + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
    }
}
