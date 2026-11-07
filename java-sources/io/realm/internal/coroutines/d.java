package io.realm.internal.coroutines;

import M9.s;
import io.realm.DynamicRealmObject;
import io.realm.RealmChangeListener;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.RealmResults;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements RealmChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f17731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f17732c;

    public /* synthetic */ d(s sVar, InternalFlowFactory internalFlowFactory, int i10) {
        this.f17730a = i10;
        this.f17731b = sVar;
        this.f17732c = internalFlowFactory;
    }

    @Override // io.realm.RealmChangeListener
    public final void onChange(Object obj) {
        switch (this.f17730a) {
            case 0:
                InternalFlowFactory.C10413.m27invokeSuspend$lambda0(this.f17731b, this.f17732c, (RealmResults) obj);
                break;
            case 1:
                InternalFlowFactory.C10424.m30invokeSuspend$lambda0(this.f17731b, this.f17732c, (RealmResults) obj);
                break;
            case 2:
                InternalFlowFactory.C10435.m33invokeSuspend$lambda0(this.f17731b, this.f17732c, (RealmList) obj);
                break;
            case 3:
                InternalFlowFactory.C10446.m36invokeSuspend$lambda0(this.f17731b, this.f17732c, (RealmList) obj);
                break;
            case 4:
                InternalFlowFactory.AnonymousClass7.m39invokeSuspend$lambda0(this.f17731b, this.f17732c, (RealmModel) obj);
                break;
            default:
                InternalFlowFactory.AnonymousClass8.m42invokeSuspend$lambda0(this.f17731b, this.f17732c, (DynamicRealmObject) obj);
                break;
        }
    }
}
