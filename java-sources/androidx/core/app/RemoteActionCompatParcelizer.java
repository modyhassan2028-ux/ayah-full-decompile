package androidx.core.app;

import Y2.b;
import Y2.c;
import Y2.d;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVarH = remoteActionCompat.f12320a;
        boolean z10 = true;
        if (bVar.e(1)) {
            dVarH = bVar.h();
        }
        remoteActionCompat.f12320a = (IconCompat) dVarH;
        CharSequence charSequence = remoteActionCompat.f12321b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f10384e);
        }
        remoteActionCompat.f12321b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f12322c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f10384e);
        }
        remoteActionCompat.f12322c = charSequence2;
        remoteActionCompat.f12323d = (PendingIntent) bVar.g(remoteActionCompat.f12323d, 4);
        boolean z11 = remoteActionCompat.f12324e;
        if (bVar.e(5)) {
            z11 = ((c) bVar).f10384e.readInt() != 0;
        }
        remoteActionCompat.f12324e = z11;
        boolean z12 = remoteActionCompat.f12325f;
        if (!bVar.e(6)) {
            z10 = z12;
        } else if (((c) bVar).f10384e.readInt() == 0) {
            z10 = false;
        }
        remoteActionCompat.f12325f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f12320a;
        bVar.i(1);
        bVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f12321b;
        bVar.i(2);
        Parcel parcel = ((c) bVar).f10384e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f12322c;
        bVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        bVar.k(remoteActionCompat.f12323d, 4);
        boolean z10 = remoteActionCompat.f12324e;
        bVar.i(5);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = remoteActionCompat.f12325f;
        bVar.i(6);
        parcel.writeInt(z11 ? 1 : 0);
    }
}
