package com.squareup.moshi;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class A extends JsonAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f15405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JsonAdapter f15408d;

    public A(Type type, String str, Object obj) {
        this.f15405a = type;
        this.f15406b = str;
        this.f15407c = obj;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object a(n nVar) {
        JsonAdapter jsonAdapter = this.f15408d;
        if (jsonAdapter != null) {
            return jsonAdapter.a(nVar);
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        JsonAdapter jsonAdapter = this.f15408d;
        if (jsonAdapter == null) {
            throw new IllegalStateException("JsonAdapter isn't ready");
        }
        jsonAdapter.e(sVar, obj);
    }

    public final String toString() {
        JsonAdapter jsonAdapter = this.f15408d;
        return jsonAdapter != null ? jsonAdapter.toString() : super.toString();
    }
}
