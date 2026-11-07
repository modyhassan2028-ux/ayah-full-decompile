package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0815g implements InterfaceC0850n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Double f14246r;

    public C0815g(Double d5) {
        if (d5 == null) {
            this.f14246r = Double.valueOf(Double.NaN);
        } else {
            this.f14246r = d5;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Double b() {
        return this.f14246r;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Boolean d() {
        Double d5 = this.f14246r;
        boolean z10 = false;
        if (!Double.isNaN(d5.doubleValue()) && d5.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0815g) {
            return this.f14246r.equals(((C0815g) obj).f14246r);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final Iterator f() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n g(String str, Aa.a aVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new C0865q(h());
        }
        throw new IllegalArgumentException(h() + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final String h() {
        Double d5 = this.f14246r;
        if (Double.isNaN(d5.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d5.doubleValue())) {
            return d5.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d5.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i10 >= 0 || i10 <= -7) && (i10 < 0 || i10 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    public final int hashCode() {
        return this.f14246r.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0850n
    public final InterfaceC0850n l() {
        return new C0815g(this.f14246r);
    }

    public final String toString() {
        return h();
    }
}
