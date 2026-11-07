package io.realm.internal.coroutines;

import M9.s;
import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmList;
import io.realm.RealmResults;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements OrderedRealmCollectionChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f17721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f17722c;

    public /* synthetic */ a(s sVar, InternalFlowFactory internalFlowFactory, int i10) {
        this.f17720a = i10;
        this.f17721b = sVar;
        this.f17722c = internalFlowFactory;
    }

    @Override // io.realm.OrderedRealmCollectionChangeListener
    public final void onChange(Object obj, OrderedCollectionChangeSet orderedCollectionChangeSet) {
        switch (this.f17720a) {
            case 0:
                InternalFlowFactory.AnonymousClass1.m5invokeSuspend$lambda0(this.f17721b, this.f17722c, (RealmResults) obj, orderedCollectionChangeSet);
                break;
            case 1:
                InternalFlowFactory.AnonymousClass2.m8invokeSuspend$lambda0(this.f17721b, this.f17722c, (RealmResults) obj, orderedCollectionChangeSet);
                break;
            case 2:
                InternalFlowFactory.AnonymousClass3.m11invokeSuspend$lambda0(this.f17721b, this.f17722c, (RealmList) obj, orderedCollectionChangeSet);
                break;
            default:
                InternalFlowFactory.AnonymousClass4.m14invokeSuspend$lambda0(this.f17721b, this.f17722c, (RealmList) obj, orderedCollectionChangeSet);
                break;
        }
    }
}
