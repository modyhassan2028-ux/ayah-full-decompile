package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14002b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14003a;

    public D(int i10) {
        this.f14003a = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        int i10 = ((D) obj).f14003a;
        int i11 = this.f14003a;
        if (i11 != 0) {
            return i11 == i10;
        }
        throw null;
    }

    public final int hashCode() {
        int i10 = this.f14003a;
        if (i10 != 0) {
            return ((i10 ^ (-485106924)) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i10 = this.f14003a;
        if (i10 == 1) {
            str = "ALL_CHECKS";
        } else if (i10 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        StringBuilder sb = new StringBuilder("READ_AND_WRITE".length() + str.length() + "".length() + 73 + 91 + 1);
        p245z2.a.I(sb, "FileComplianceOptions{fileOwner=, hasDifferentDmaOwner=false, fileChecks=", str, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", "READ_AND_WRITE");
        sb.append("}");
        return sb.toString();
    }
}
