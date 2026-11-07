package com.squareup.moshi;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
abstract class CollectionJsonAdapter<C extends Collection<T>, T> extends JsonAdapter<C> {
    public static final j FACTORY = new g();
    private final JsonAdapter<T> elementAdapter;

    public /* synthetic */ CollectionJsonAdapter(JsonAdapter jsonAdapter, g gVar) {
        this(jsonAdapter);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Collection a(n nVar) {
        Collection collectionG = g();
        nVar.b();
        while (nVar.w()) {
            collectionG.add(this.elementAdapter.a(nVar));
        }
        nVar.i();
        return collectionG;
    }

    public abstract Collection g();

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void e(s sVar, Collection collection) {
        sVar.b();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.elementAdapter.e(sVar, it.next());
        }
        ((q) sVar).X(1, 2, ']');
    }

    public final String toString() {
        return this.elementAdapter + ".collection()";
    }

    private CollectionJsonAdapter(JsonAdapter<T> jsonAdapter) {
        this.elementAdapter = jsonAdapter;
    }
}
