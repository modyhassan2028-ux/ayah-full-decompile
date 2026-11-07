package i7;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p029c8.i f16868a;

    static {
        p029c8.b bVar = p029c8.d.f13545s;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        p017b7.g.Q(24, objArr);
        f16868a = p029c8.d.f(24, objArr);
    }

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(com.google.android.gms.internal.measurement.R1 r10, p029c8.n nVar, p029c8.n nVar2, p029c8.p pVar, char[] cArr, int i10, int i11, int i12, String str, String str2, String str3, boolean z10, boolean z11) {
        D1 d1;
        char c10;
        int iC = c(r10);
        if (iC > 0 && (i11 != 1 || i10 != 1)) {
            cArr[iC] = '2';
        }
        if (g(r10, nVar2) == com.google.android.gms.internal.measurement.S1.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c10 = '3';
        } else {
            if (r10 == com.google.android.gms.internal.measurement.R1.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i12 == 1 && pVar.f13579u.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (nVar.containsKey(r10) && (d1 = (D1) nVar.get(r10)) != null) {
                int iOrdinal = d1.ordinal();
                com.google.android.gms.internal.measurement.S1 s10 = com.google.android.gms.internal.measurement.S1.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    com.google.android.gms.internal.measurement.S1 s11 = com.google.android.gms.internal.measurement.S1.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(r10, nVar2) == s10 ? f(r10, cArr, str3, z11) : e(r10, cArr, str2, z10);
                        }
                        if (iOrdinal == 3) {
                            return g(r10, nVar2) == s11 ? e(r10, cArr, str2, z10) : f(r10, cArr, str3, z11);
                        }
                        c10 = '0';
                    } else if (g(r10, nVar2) != s11) {
                        return f(r10, cArr, str3, z11);
                    }
                } else if (g(r10, nVar2) != s10) {
                    return e(r10, cArr, str2, z10);
                }
                c10 = '8';
            } else {
                c10 = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c10;
        return false;
    }

    public static final int c(com.google.android.gms.internal.measurement.R1 r10) {
        if (r10 == com.google.android.gms.internal.measurement.R1.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (r10 == com.google.android.gms.internal.measurement.R1.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (r10 == com.google.android.gms.internal.measurement.R1.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return r10 == com.google.android.gms.internal.measurement.R1.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(com.google.android.gms.internal.measurement.R1 r10, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < r10.a()) ? "0" : String.valueOf(str.charAt(r10.a() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= r10.a()) {
            strValueOf = String.valueOf(str2.charAt(r10.a() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(com.google.android.gms.internal.measurement.R1 r10, char[] cArr, String str, boolean z10) {
        char c10;
        int iC = c(r10);
        if (!z10) {
            c10 = '4';
        } else {
            if (str.length() >= r10.a()) {
                char cCharAt = str.charAt(r10.a() - 1);
                boolean z11 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z11;
            }
            c10 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c10;
        }
        return false;
    }

    public static final boolean f(com.google.android.gms.internal.measurement.R1 r10, char[] cArr, String str, boolean z10) {
        char c10;
        int iC = c(r10);
        if (!z10) {
            c10 = '5';
        } else {
            if (str.length() >= r10.a()) {
                char cCharAt = str.charAt(r10.a() - 1);
                boolean z11 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z11;
            }
            c10 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c10;
        }
        return false;
    }

    public static final com.google.android.gms.internal.measurement.S1 g(com.google.android.gms.internal.measurement.R1 r10, p029c8.n nVar) {
        Object obj = nVar.get(r10);
        if (obj == null) {
            obj = com.google.android.gms.internal.measurement.S1.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (com.google.android.gms.internal.measurement.S1) obj;
    }
}
