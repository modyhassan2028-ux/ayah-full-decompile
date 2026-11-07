package io.realm.internal.coroutines;

import M9.s;
import io.realm.BaseRealm;
import io.realm.DynamicRealm;
import io.realm.Realm;
import io.realm.RealmChangeListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements RealmChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f17727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f17728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BaseRealm f17729d;

    public /* synthetic */ c(s sVar, InternalFlowFactory internalFlowFactory, BaseRealm baseRealm, int i10) {
        this.f17726a = i10;
        this.f17727b = sVar;
        this.f17728c = internalFlowFactory;
        this.f17729d = baseRealm;
    }

    @Override // io.realm.RealmChangeListener
    public final void onChange(Object obj) {
        switch (this.f17726a) {
            case 0:
                InternalFlowFactory.C10391.m23invokeSuspend$lambda0(this.f17727b, this.f17728c, (Realm) this.f17729d, (Realm) obj);
                break;
            default:
                InternalFlowFactory.C10402.m25invokeSuspend$lambda0(this.f17727b, this.f17728c, (DynamicRealm) this.f17729d, (DynamicRealm) obj);
                break;
        }
    }
}
