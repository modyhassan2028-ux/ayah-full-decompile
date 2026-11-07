package com.squareup.moshi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class h extends CollectionJsonAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15446a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(JsonAdapter jsonAdapter, g gVar, int i10) {
        super(jsonAdapter, gVar);
        this.f15446a = i10;
    }

    @Override // com.squareup.moshi.CollectionJsonAdapter, com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ Object a(n nVar) {
        switch (this.f15446a) {
            case 0:
                break;
        }
        return a(nVar);
    }

    @Override // com.squareup.moshi.CollectionJsonAdapter, com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void e(s sVar, Object obj) {
        switch (this.f15446a) {
            case 0:
                e(sVar, (Collection) obj);
                break;
            default:
                e(sVar, (Collection) obj);
                break;
        }
    }

    @Override // com.squareup.moshi.CollectionJsonAdapter
    public final Collection g() {
        switch (this.f15446a) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }
}
