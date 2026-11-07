package com.squareup.moshi;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Map.Entry {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public w f15497r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public w f15498s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public w f15499t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public w f15500u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public w f15501v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f15502w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f15503x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f15504y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f15505z;

    public w() {
        this.f15502w = null;
        this.f15503x = -1;
        this.f15501v = this;
        this.f15500u = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f15502w;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f15504y;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f15502w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15504y;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f15502w;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f15504y;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f15504y;
        this.f15504y = obj;
        return obj2;
    }

    public final String toString() {
        return this.f15502w + "=" + this.f15504y;
    }

    public w(w wVar, Object obj, int i10, w wVar2, w wVar3) {
        this.f15497r = wVar;
        this.f15502w = obj;
        this.f15503x = i10;
        this.f15505z = 1;
        this.f15500u = wVar2;
        this.f15501v = wVar3;
        wVar3.f15500u = this;
        wVar2.f15501v = this;
    }
}
