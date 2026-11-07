package F1;

import Da.r;
import E2.N0;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0 f2156a = new N0(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f2157b = new b(0);

    public static r a(Context context, List list) {
        Y2.a.n("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                g gVar = (g) list.get(i10);
                ProviderInfo providerInfoB = b(context.getPackageManager(), gVar, context.getResources());
                if (providerInfoB == null) {
                    return new r(2, (byte) 0);
                }
                arrayList.add(c(context, gVar, providerInfoB.authority));
            }
            return new r(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, g gVar, Resources resources) {
        b bVar = f2157b;
        N0 n6 = f2156a;
        Y2.a.n("FontProvider.getProvider");
        try {
            List listM = gVar.f2161d;
            String str = gVar.f2158a;
            String str2 = gVar.f2159b;
            if (listM == null) {
                listM = p244z1.a.m(resources, 0);
            }
            e eVar = new e();
            eVar.f2153a = str;
            eVar.f2154b = str2;
            eVar.f2155c = listM;
            ProviderInfo providerInfo = (ProviderInfo) n6.g(eVar);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, bVar);
            for (int i10 = 0; i10 < listM.size(); i10++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM.get(i10));
                Collections.sort(arrayList2, bVar);
                if (arrayList.size() == arrayList2.size()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            n6.k(eVar, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static l[] c(Context context, g gVar, String str) {
        c cVar;
        Y2.a.n("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                cVar = new p248z6.c(context, uriBuild);
            } else {
                O8.c cVar2 = new O8.c();
                cVar2.f6511r = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                cVar = cVar2;
            }
            Cursor cursorE = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Y2.a.n("ContentQueryWrapper.query");
                try {
                    cursorE = cVar.e(uriBuild, strArr, new String[]{gVar.f2160c});
                    Trace.endSection();
                    if (cursorE != null && cursorE.getCount() > 0) {
                        int columnIndex = cursorE.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorE.getColumnIndex("_id");
                        int columnIndex3 = cursorE.getColumnIndex("file_id");
                        int columnIndex4 = cursorE.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorE.getColumnIndex("font_weight");
                        int columnIndex6 = cursorE.getColumnIndex("font_italic");
                        while (cursorE.moveToNext()) {
                            int i10 = columnIndex != -1 ? cursorE.getInt(columnIndex) : 0;
                            ArrayList arrayList3 = arrayList2;
                            arrayList3.add(new l(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorE.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorE.getLong(columnIndex3)), columnIndex4 != -1 ? cursorE.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorE.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorE.getInt(columnIndex6) == 1, i10));
                            arrayList2 = arrayList3;
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorE != null) {
                        cursorE.close();
                    }
                    cVar.close();
                    return (l[]) arrayList.toArray(new l[0]);
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                if (cursorE != null) {
                    cursorE.close();
                }
                cVar.close();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
