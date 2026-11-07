package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public enum S1 implements InterfaceC0838k2 {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f14126r;

    S1(int i10) {
        this.f14126r = i10;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0838k2
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f14126r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14126r);
    }
}
