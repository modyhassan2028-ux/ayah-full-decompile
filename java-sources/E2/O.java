package E2;

import E2.O;
import U6.C0528f;
import U6.C0529g;
import U6.C0531i;
import U6.C0533k;
import U6.C0534l;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1595a;

    public /* synthetic */ O(int i10) {
        this.f1595a = i10;
    }

    public static void a(C0529g c0529g, Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        int i11 = c0529g.f8260r;
        p017b7.g.G0(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = c0529g.f8261s;
        p017b7.g.G0(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = c0529g.f8262t;
        p017b7.g.G0(parcel, 3, 4);
        parcel.writeInt(i13);
        p017b7.g.z0(parcel, 4, c0529g.f8263u);
        p017b7.g.x0(parcel, 5, c0529g.f8264v);
        p017b7.g.A0(parcel, 6, c0529g.f8265w, i10);
        p017b7.g.w0(parcel, 7, c0529g.f8266x);
        p017b7.g.y0(parcel, 8, c0529g.f8267y, i10);
        p017b7.g.A0(parcel, 10, c0529g.f8268z, i10);
        p017b7.g.A0(parcel, 11, c0529g.f8255A, i10);
        boolean z10 = c0529g.f8256B;
        p017b7.g.G0(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = c0529g.f8257C;
        p017b7.g.G0(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z11 = c0529g.f8258D;
        p017b7.g.G0(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        p017b7.g.z0(parcel, 15, c0529g.f8259E);
        p017b7.g.F0(parcel, iD0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Bundle bundle;
        PendingIntent pendingIntent = null;
        p010b.b bVar = null;
        Bundle bundleS = null;
        Scope[] scopeArr = null;
        ArrayList arrayListX = null;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        int iG0 = 0;
        int iG1 = 0;
        int iG2 = 0;
        int iG3 = 0;
        boolean zD0 = false;
        switch (this.f1595a) {
            case 0:
                P p10 = new P();
                p10.f1601r = parcel.readInt();
                p10.f1602s = parcel.readInt();
                p10.f1603t = parcel.readInt() == 1;
                return p10;
            case 1:
                L0 l10 = new L0();
                l10.f1561r = parcel.readInt();
                l10.f1562s = parcel.readInt();
                l10.f1564u = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    l10.f1563t = iArr;
                    parcel.readIntArray(iArr);
                }
                return l10;
            case 2:
                M0 m10 = new M0();
                m10.f1570r = parcel.readInt();
                m10.f1571s = parcel.readInt();
                int i11 = parcel.readInt();
                m10.f1572t = i11;
                if (i11 > 0) {
                    int[] iArr2 = new int[i11];
                    m10.f1573u = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i12 = parcel.readInt();
                m10.f1574v = i12;
                if (i12 > 0) {
                    int[] iArr3 = new int[i12];
                    m10.f1575w = iArr3;
                    parcel.readIntArray(iArr3);
                }
                m10.f1577y = parcel.readInt() == 1;
                m10.f1578z = parcel.readInt() == 1;
                m10.f1569A = parcel.readInt() == 1;
                m10.f1576x = parcel.readArrayList(L0.class.getClassLoader());
                return m10;
            case 3:
                K7.f fVar = new K7.f();
                fVar.f5289r = parcel.readInt();
                fVar.f5290s = (H7.y) parcel.readParcelable(K7.f.class.getClassLoader());
                return fVar;
            case 4:
                N1.i iVar = new N1.i(parcel);
                iVar.f5993r = parcel.readInt();
                return iVar;
            case 5:
                int iP0 = p000a.a.p0(parcel);
                int iG4 = 0;
                int iG5 = 0;
                String strV5 = null;
                while (parcel.dataPosition() < iP0) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        iG4 = p000a.a.g0(parcel, i13);
                    } else if (c10 == 2) {
                        iG5 = p000a.a.g0(parcel, i13);
                    } else if (c10 == 3) {
                        pendingIntent = (PendingIntent) p000a.a.u(parcel, i13, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        p000a.a.k0(parcel, i13);
                    } else {
                        strV5 = p000a.a.v(parcel, i13);
                    }
                }
                p000a.a.C(parcel, iP0);
                return new R6.b(iG4, iG5, pendingIntent, strV5);
            case 6:
                int iP1 = p000a.a.p0(parcel);
                long jH0 = -1;
                while (parcel.dataPosition() < iP1) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        strV4 = p000a.a.v(parcel, i14);
                    } else if (c11 == 2) {
                        iG0 = p000a.a.g0(parcel, i14);
                    } else if (c11 != 3) {
                        p000a.a.k0(parcel, i14);
                    } else {
                        jH0 = p000a.a.h0(parcel, i14);
                    }
                }
                p000a.a.C(parcel, iP1);
                return new R6.d(jH0, iG0, strV4);
            case 7:
                int iP2 = p000a.a.p0(parcel);
                int iG6 = 0;
                int iG7 = 0;
                while (parcel.dataPosition() < iP2) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 1) {
                        zD0 = p000a.a.d0(parcel, i15);
                    } else if (c12 == 2) {
                        strV3 = p000a.a.v(parcel, i15);
                    } else if (c12 == 3) {
                        iG6 = p000a.a.g0(parcel, i15);
                    } else if (c12 != 4) {
                        p000a.a.k0(parcel, i15);
                    } else {
                        iG7 = p000a.a.g0(parcel, i15);
                    }
                }
                p000a.a.C(parcel, iP2);
                return new R6.q(strV3, zD0, iG6, iG7);
            case 8:
                int iP3 = p000a.a.p0(parcel);
                while (parcel.dataPosition() < iP3) {
                    int i16 = parcel.readInt();
                    char c13 = (char) i16;
                    if (c13 == 1) {
                        iG3 = p000a.a.g0(parcel, i16);
                    } else if (c13 != 2) {
                        p000a.a.k0(parcel, i16);
                    } else {
                        strV2 = p000a.a.v(parcel, i16);
                    }
                }
                p000a.a.C(parcel, iP3);
                return new Scope(iG3, strV2);
            case 9:
                int iP4 = p000a.a.p0(parcel);
                R6.b bVar2 = null;
                int iG8 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iP4) {
                    int i17 = parcel.readInt();
                    char c14 = (char) i17;
                    if (c14 == 1) {
                        iG8 = p000a.a.g0(parcel, i17);
                    } else if (c14 == 2) {
                        strV = p000a.a.v(parcel, i17);
                    } else if (c14 == 3) {
                        pendingIntent2 = (PendingIntent) p000a.a.u(parcel, i17, PendingIntent.CREATOR);
                    } else if (c14 != 4) {
                        p000a.a.k0(parcel, i17);
                    } else {
                        bVar2 = (R6.b) p000a.a.u(parcel, i17, R6.b.CREATOR);
                    }
                }
                p000a.a.C(parcel, iP4);
                return new Status(iG8, strV, pendingIntent2, bVar2);
            case 10:
                T7.b bVar3 = new T7.b(parcel);
                bVar3.f7860r = parcel.readFloat();
                bVar3.f7861s = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                bVar3.f7862t = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                bVar3.f7863u = parcel.readFloat();
                bVar3.f7864v = parcel.createBooleanArray()[0];
                return bVar3;
            case 11:
                return new T7.e(parcel);
            case 12:
                int iP5 = p000a.a.p0(parcel);
                while (parcel.dataPosition() < iP5) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 1) {
                        iG2 = p000a.a.g0(parcel, i18);
                    } else if (c15 != 2) {
                        p000a.a.k0(parcel, i18);
                    } else {
                        arrayListX = p000a.a.x(parcel, i18, C0531i.CREATOR);
                    }
                }
                p000a.a.C(parcel, iP5);
                return new C0534l(iG2, arrayListX);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                int iP6 = p000a.a.p0(parcel);
                int iG9 = -1;
                long jH1 = 0;
                long jH2 = 0;
                String strV6 = null;
                String strV7 = null;
                int iG10 = 0;
                int iG11 = 0;
                int iG12 = 0;
                int iG13 = 0;
                while (parcel.dataPosition() < iP6) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            iG10 = p000a.a.g0(parcel, i19);
                            break;
                        case 2:
                            iG11 = p000a.a.g0(parcel, i19);
                            break;
                        case 3:
                            iG12 = p000a.a.g0(parcel, i19);
                            break;
                        case 4:
                            jH1 = p000a.a.h0(parcel, i19);
                            break;
                        case 5:
                            jH2 = p000a.a.h0(parcel, i19);
                            break;
                        case 6:
                            strV6 = p000a.a.v(parcel, i19);
                            break;
                        case 7:
                            strV7 = p000a.a.v(parcel, i19);
                            break;
                        case '\b':
                            iG13 = p000a.a.g0(parcel, i19);
                            break;
                        case '\t':
                            iG9 = p000a.a.g0(parcel, i19);
                            break;
                        default:
                            p000a.a.k0(parcel, i19);
                            break;
                    }
                }
                p000a.a.C(parcel, iP6);
                return new C0531i(iG10, iG11, iG12, jH1, jH2, strV6, strV7, iG13, iG9);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                int iP7 = p000a.a.p0(parcel);
                int iG14 = 0;
                int iG15 = 0;
                while (parcel.dataPosition() < iP7) {
                    int i20 = parcel.readInt();
                    char c16 = (char) i20;
                    if (c16 == 1) {
                        iG1 = p000a.a.g0(parcel, i20);
                    } else if (c16 == 2) {
                        iG14 = p000a.a.g0(parcel, i20);
                    } else if (c16 == 3) {
                        iG15 = p000a.a.g0(parcel, i20);
                    } else if (c16 != 4) {
                        p000a.a.k0(parcel, i20);
                    } else {
                        scopeArr = (Scope[]) p000a.a.w(parcel, i20, Scope.CREATOR);
                    }
                }
                p000a.a.C(parcel, iP7);
                return new U6.q(iG1, iG14, iG15, scopeArr);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                int iP8 = p000a.a.p0(parcel);
                int iG16 = 0;
                boolean zD1 = false;
                boolean zD2 = false;
                int iG17 = 0;
                int iG18 = 0;
                while (parcel.dataPosition() < iP8) {
                    int i21 = parcel.readInt();
                    char c17 = (char) i21;
                    if (c17 == 1) {
                        iG16 = p000a.a.g0(parcel, i21);
                    } else if (c17 == 2) {
                        zD1 = p000a.a.d0(parcel, i21);
                    } else if (c17 == 3) {
                        zD2 = p000a.a.d0(parcel, i21);
                    } else if (c17 == 4) {
                        iG17 = p000a.a.g0(parcel, i21);
                    } else if (c17 != 5) {
                        p000a.a.k0(parcel, i21);
                    } else {
                        iG18 = p000a.a.g0(parcel, i21);
                    }
                }
                p000a.a.C(parcel, iP8);
                return new C0533k(iG16, zD1, zD2, iG17, iG18);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                int iP9 = p000a.a.p0(parcel);
                C0528f c0528f = null;
                int iG19 = 0;
                R6.d[] dVarArr = null;
                while (parcel.dataPosition() < iP9) {
                    int i22 = parcel.readInt();
                    char c18 = (char) i22;
                    if (c18 == 1) {
                        bundleS = p000a.a.s(parcel, i22);
                    } else if (c18 == 2) {
                        dVarArr = (R6.d[]) p000a.a.w(parcel, i22, R6.d.CREATOR);
                    } else if (c18 == 3) {
                        iG19 = p000a.a.g0(parcel, i22);
                    } else if (c18 != 4) {
                        p000a.a.k0(parcel, i22);
                    } else {
                        c0528f = (C0528f) p000a.a.u(parcel, i22, C0528f.CREATOR);
                    }
                }
                p000a.a.C(parcel, iP9);
                U6.F f3 = new U6.F();
                f3.f8201r = bundleS;
                f3.f8202s = dVarArr;
                f3.f8203t = iG19;
                f3.f8204u = c0528f;
                return f3;
            case 17:
                int iP10 = p000a.a.p0(parcel);
                C0533k c0533k = null;
                int[] iArr4 = null;
                int[] iArr5 = null;
                boolean zD3 = false;
                boolean zD4 = false;
                int iG20 = 0;
                while (parcel.dataPosition() < iP10) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            c0533k = (C0533k) p000a.a.u(parcel, i23, C0533k.CREATOR);
                            break;
                        case 2:
                            zD3 = p000a.a.d0(parcel, i23);
                            break;
                        case 3:
                            zD4 = p000a.a.d0(parcel, i23);
                            break;
                        case 4:
                            int iI0 = p000a.a.i0(parcel, i23);
                            int iDataPosition = parcel.dataPosition();
                            if (iI0 != 0) {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + iI0);
                                iArr4 = iArrCreateIntArray;
                            } else {
                                iArr4 = null;
                            }
                            break;
                        case 5:
                            iG20 = p000a.a.g0(parcel, i23);
                            break;
                        case 6:
                            int iI1 = p000a.a.i0(parcel, i23);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iI1 != 0) {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iI1);
                                iArr5 = iArrCreateIntArray2;
                            } else {
                                iArr5 = null;
                            }
                            break;
                        default:
                            p000a.a.k0(parcel, i23);
                            break;
                    }
                }
                p000a.a.C(parcel, iP10);
                return new C0528f(c0533k, zD3, zD4, iArr4, iG20, iArr5);
            case 18:
                int iP11 = p000a.a.p0(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr2 = C0529g.f8253F;
                R6.d[] dVarArr2 = C0529g.f8254G;
                R6.d[] dVarArr3 = dVarArr2;
                String strV8 = null;
                IBinder iBinder = null;
                Account account = null;
                String strV9 = null;
                int iG21 = 0;
                int iG22 = 0;
                int iG23 = 0;
                boolean zD5 = false;
                int iG24 = 0;
                boolean zD6 = false;
                while (parcel.dataPosition() < iP11) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            iG21 = p000a.a.g0(parcel, i24);
                            break;
                        case 2:
                            iG22 = p000a.a.g0(parcel, i24);
                            break;
                        case 3:
                            iG23 = p000a.a.g0(parcel, i24);
                            break;
                        case 4:
                            strV8 = p000a.a.v(parcel, i24);
                            break;
                        case 5:
                            int iI2 = p000a.a.i0(parcel, i24);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iI2 != 0) {
                                IBinder strongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(iDataPosition3 + iI2);
                                iBinder = strongBinder;
                            } else {
                                iBinder = null;
                            }
                            break;
                        case 6:
                            scopeArr2 = (Scope[]) p000a.a.w(parcel, i24, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = p000a.a.s(parcel, i24);
                            break;
                        case '\b':
                            account = (Account) p000a.a.u(parcel, i24, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            p000a.a.k0(parcel, i24);
                            break;
                        case '\n':
                            dVarArr2 = (R6.d[]) p000a.a.w(parcel, i24, R6.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (R6.d[]) p000a.a.w(parcel, i24, R6.d.CREATOR);
                            break;
                        case '\f':
                            zD5 = p000a.a.d0(parcel, i24);
                            break;
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                            iG24 = p000a.a.g0(parcel, i24);
                            break;
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                            zD6 = p000a.a.d0(parcel, i24);
                            break;
                        case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                            strV9 = p000a.a.v(parcel, i24);
                            break;
                    }
                }
                p000a.a.C(parcel, iP11);
                return new C0529g(iG21, iG22, iG23, strV8, iBinder, scopeArr2, bundle2, account, dVarArr2, dVarArr3, zD5, iG24, zD6, strV9);
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return new ParcelImpl(parcel);
            case 20:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new O(20);

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    public final int f11279r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public final MediaDescriptionCompat f11280s;

                    {
                        this.f11279r = parcel.readInt();
                        this.f11280s = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f11279r + ", mDescription=" + this.f11280s + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i25) {
                        parcel2.writeInt(this.f11279r);
                        this.f11280s.writeToParcel(parcel2, i25);
                    }
                };
            case 21:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strG = android.support.v4.media.f.g(mediaDescription);
                CharSequence charSequenceI = android.support.v4.media.f.i(mediaDescription);
                CharSequence charSequenceH = android.support.v4.media.f.h(mediaDescription);
                CharSequence charSequenceC = android.support.v4.media.f.c(mediaDescription);
                Bitmap bitmapE = android.support.v4.media.f.e(mediaDescription);
                Uri uriF = android.support.v4.media.f.f(mediaDescription);
                Bundle bundleD = android.support.v4.media.f.d(mediaDescription);
                if (bundleD != null) {
                    bundleD = android.support.v4.media.session.r.P(bundleD);
                }
                Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriA == null) {
                    bundle = bundleD;
                } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
                    bundle = null;
                } else {
                    bundleD.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleD;
                }
                if (uriA == null) {
                    uriA = android.support.v4.media.g.a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
                mediaDescriptionCompat.f11289z = mediaDescription;
                return mediaDescriptionCompat;
            case 22:
                return new MediaMetadataCompat(parcel);
            case 23:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 24:
                p010b.d dVar = new p010b.d();
                IBinder strongBinder2 = parcel.readStrongBinder();
                int i25 = p010b.c.g;
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface(p010b.b.f13115c);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p010b.b)) {
                        p010b.a aVar = new p010b.a();
                        aVar.f13114f = strongBinder2;
                        bVar = aVar;
                    } else {
                        bVar = (p010b.b) iInterfaceQueryLocalInterface;
                    }
                }
                dVar.f13117r = bVar;
                return dVar;
            case 25:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.j) parcel.readParcelable(com.google.android.material.datepicker.j.class.getClassLoader()), (com.google.android.material.datepicker.j) parcel.readParcelable(com.google.android.material.datepicker.j.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.j) parcel.readParcelable(com.google.android.material.datepicker.j.class.getClassLoader()), parcel.readInt());
            case 26:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 27:
                return com.google.android.material.datepicker.j.a(parcel.readInt(), parcel.readInt());
            case 28:
                return new p052ea.b(parcel);
            default:
                p251z9.j.e(parcel, "parcel");
                return new p053f.a(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f1595a) {
            case 0:
                return new P[i10];
            case 1:
                return new L0[i10];
            case 2:
                return new M0[i10];
            case 3:
                return new K7.f[i10];
            case 4:
                return new N1.i[i10];
            case 5:
                return new R6.b[i10];
            case 6:
                return new R6.d[i10];
            case 7:
                return new R6.q[i10];
            case 8:
                return new Scope[i10];
            case 9:
                return new Status[i10];
            case 10:
                return new T7.b[i10];
            case 11:
                return new T7.e[i10];
            case 12:
                return new C0534l[i10];
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return new C0531i[i10];
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return new U6.q[i10];
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return new C0533k[i10];
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return new U6.F[i10];
            case 17:
                return new C0528f[i10];
            case 18:
                return new C0529g[i10];
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                return new ParcelImpl[i10];
            case 20:
                return new MediaBrowserCompat$MediaItem[i10];
            case 21:
                return new MediaDescriptionCompat[i10];
            case 22:
                return new MediaMetadataCompat[i10];
            case 23:
                return new RatingCompat[i10];
            case 24:
                return new p010b.d[i10];
            case 25:
                return new com.google.android.material.datepicker.b[i10];
            case 26:
                return new com.google.android.material.datepicker.d[i10];
            case 27:
                return new com.google.android.material.datepicker.j[i10];
            case 28:
                return new p052ea.b[i10];
            default:
                return new p053f.a[i10];
        }
    }
}
