package androidx.core.graphics.drawable;

import Y2.b;
import Y2.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f12334a = bVar.f(iconCompat.f12334a, 1);
        byte[] bArr = iconCompat.f12336c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f10384e;
            int i10 = parcel.readInt();
            if (i10 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i10];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f12336c = bArr;
        iconCompat.f12337d = bVar.g(iconCompat.f12337d, 3);
        iconCompat.f12338e = bVar.f(iconCompat.f12338e, 4);
        iconCompat.f12339f = bVar.f(iconCompat.f12339f, 5);
        iconCompat.g = (ColorStateList) bVar.g(iconCompat.g, 6);
        String string = iconCompat.f12341i;
        if (bVar.e(7)) {
            string = ((c) bVar).f10384e.readString();
        }
        iconCompat.f12341i = string;
        String string2 = iconCompat.j;
        if (bVar.e(8)) {
            string2 = ((c) bVar).f10384e.readString();
        }
        iconCompat.j = string2;
        iconCompat.f12340h = PorterDuff.Mode.valueOf(iconCompat.f12341i);
        switch (iconCompat.f12334a) {
            case -1:
                Parcelable parcelable = iconCompat.f12337d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f12335b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f12337d;
                if (parcelable2 != null) {
                    iconCompat.f12335b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f12336c;
                iconCompat.f12335b = bArr3;
                iconCompat.f12334a = 3;
                iconCompat.f12338e = 0;
                iconCompat.f12339f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f12336c, Charset.forName("UTF-16"));
                iconCompat.f12335b = str;
                if (iconCompat.f12334a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f12335b = iconCompat.f12336c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f12341i = iconCompat.f12340h.name();
        switch (iconCompat.f12334a) {
            case -1:
                iconCompat.f12337d = (Parcelable) iconCompat.f12335b;
                break;
            case 1:
            case 5:
                iconCompat.f12337d = (Parcelable) iconCompat.f12335b;
                break;
            case 2:
                iconCompat.f12336c = ((String) iconCompat.f12335b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f12336c = (byte[]) iconCompat.f12335b;
                break;
            case 4:
            case 6:
                iconCompat.f12336c = iconCompat.f12335b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f12334a;
        if (-1 != i10) {
            bVar.j(i10, 1);
        }
        byte[] bArr = iconCompat.f12336c;
        if (bArr != null) {
            bVar.i(2);
            Parcel parcel = ((c) bVar).f10384e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f12337d;
        if (parcelable != null) {
            bVar.k(parcelable, 3);
        }
        int i11 = iconCompat.f12338e;
        if (i11 != 0) {
            bVar.j(i11, 4);
        }
        int i12 = iconCompat.f12339f;
        if (i12 != 0) {
            bVar.j(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            bVar.k(colorStateList, 6);
        }
        String str = iconCompat.f12341i;
        if (str != null) {
            bVar.i(7);
            ((c) bVar).f10384e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            bVar.i(8);
            ((c) bVar).f10384e.writeString(str2);
        }
    }
}
