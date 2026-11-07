package io.realm.internal.coroutines;

import M9.s;
import io.realm.DynamicRealmObject;
import io.realm.ObjectChangeSet;
import io.realm.RealmModel;
import io.realm.RealmObjectChangeListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements RealmObjectChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f17724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f17725c;

    public /* synthetic */ b(s sVar, InternalFlowFactory internalFlowFactory, int i10) {
        this.f17723a = i10;
        this.f17724b = sVar;
        this.f17725c = internalFlowFactory;
    }

    @Override // io.realm.RealmObjectChangeListener
    public final void onChange(RealmModel realmModel, ObjectChangeSet objectChangeSet) {
        switch (this.f17723a) {
            case 0:
                InternalFlowFactory.AnonymousClass5.m17invokeSuspend$lambda0(this.f17724b, this.f17725c, realmModel, objectChangeSet);
                break;
            default:
                InternalFlowFactory.AnonymousClass6.m20invokeSuspend$lambda0(this.f17724b, this.f17725c, (DynamicRealmObject) realmModel, objectChangeSet);
                break;
        }
    }
}
