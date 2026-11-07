package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class X implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14161a;

    public /* synthetic */ X(int i10) {
        this.f14161a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14161a) {
            case 0:
                int iP0 = p000a.a.p0(parcel);
                Bundle bundleS = null;
                String strV = null;
                boolean zD0 = false;
                long jH0 = 0;
                long jH1 = 0;
                while (parcel.dataPosition() < iP0) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        jH0 = p000a.a.h0(parcel, i10);
                    } else if (c10 == 2) {
                        jH1 = p000a.a.h0(parcel, i10);
                    } else if (c10 == 3) {
                        zD0 = p000a.a.d0(parcel, i10);
                    } else if (c10 == 7) {
                        bundleS = p000a.a.s(parcel, i10);
                    } else if (c10 != '\b') {
                        p000a.a.k0(parcel, i10);
                    } else {
                        strV = p000a.a.v(parcel, i10);
                    }
                }
                p000a.a.C(parcel, iP0);
                return new W(jH0, jH1, zD0, bundleS, strV);
            default:
                int iP1 = p000a.a.p0(parcel);
                String strV2 = null;
                int iG0 = 0;
                Intent intent = null;
                while (parcel.dataPosition() < iP1) {
                    int i11 = parcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 1) {
                        iG0 = p000a.a.g0(parcel, i11);
                    } else if (c11 == 2) {
                        strV2 = p000a.a.v(parcel, i11);
                    } else if (c11 != 3) {
                        p000a.a.k0(parcel, i11);
                    } else {
                        intent = (Intent) p000a.a.u(parcel, i11, Intent.CREATOR);
                    }
                }
                p000a.a.C(parcel, iP1);
                return new Y(iG0, strV2, intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f14161a) {
            case 0:
                return new W[i10];
            default:
                return new Y[i10];
        }
    }
}
