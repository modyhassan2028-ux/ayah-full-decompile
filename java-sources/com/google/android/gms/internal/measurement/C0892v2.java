package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0892v2 extends AbstractC0820h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f14432t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0892v2(String str, int i10) {
        super(str);
        this.f14432t = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0820h
    public final InterfaceC0850n a(Aa.a aVar, List list) {
        switch (this.f14432t) {
            case 0:
                return InterfaceC0850n.f14367i;
            case 1:
            case 2:
                return this;
            case 3:
                return new C0815g(Double.valueOf(0.0d));
            default:
                return InterfaceC0850n.f14367i;
        }
    }
}
