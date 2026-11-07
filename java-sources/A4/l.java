package A4;

import A.C0030l0;
import D0.z;
import F.A;
import H9.v;
import J3.C0304b;
import K.H;
import K.g0;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import U6.C0532j;
import W.EnumC0565h1;
import W.P;
import Z.X;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.ayah.MainActivity;
import com.ayah.R;
import com.ayah.common.data.source.json.model.booklist.BookType;
import com.ayah.common.data.source.preference.model.PreferencesBookmark;
import com.ayah.common.data.source.preference.model.PreferencesKhatmah;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p093j0.r;
import p110k9.y;
import p181s2.o;
import p181s2.q;

/* JADX INFO: loaded from: classes.dex */
public final class l extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f536t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f537u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(P p10, X x9, Context context, p150o9.c cVar) {
        super(2, cVar);
        this.f534r = 7;
        this.f537u = p10;
        this.f535s = x9;
        this.f536t = context;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f534r) {
            case 0:
                return new l((InterfaceC0402u) this.f535s, (Context) this.f536t, (P) this.f537u, cVar, 0);
            case 1:
                l lVar = new l(this.f536t, (X1.e) this.f537u, cVar, 1);
                lVar.f535s = obj;
                return lVar;
            case 2:
                l lVar2 = new l((C0304b) this.f536t, (ArrayList) this.f537u, cVar, 2);
                lVar2.f535s = obj;
                return lVar2;
            case 3:
                l lVar3 = new l((PreferencesKhatmah) this.f536t, (J3.d) this.f537u, cVar, 3);
                lVar3.f535s = obj;
                return lVar3;
            case 4:
                l lVar4 = new l((z) this.f536t, (g0) this.f537u, cVar, 4);
                lVar4.f535s = obj;
                return lVar4;
            case 5:
                return new l((InterfaceC0402u) this.f535s, (List) this.f536t, (A) this.f537u, cVar, 5);
            case 6:
                return new l((Context) this.f536t, (p046e4.a) this.f535s, (X4.c) this.f537u, cVar);
            case 7:
                return new l((P) this.f537u, (X) this.f535s, (Context) this.f536t, cVar);
            case 8:
                return new l((X) this.f535s, (q) this.f536t, (r) this.f537u, cVar, 8);
            default:
                l lVar5 = new l((s3.a) this.f536t, (BookType) this.f537u, cVar, 9);
                lVar5.f535s = obj;
                return lVar5;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f534r) {
            case 0:
                l lVar = (l) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                y yVar = y.f19095a;
                lVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                l lVar2 = (l) create((X1.b) obj, (p150o9.c) obj2);
                y yVar2 = y.f19095a;
                lVar2.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                l lVar3 = (l) create((X1.b) obj, (p150o9.c) obj2);
                y yVar3 = y.f19095a;
                lVar3.invokeSuspend(yVar3);
                return yVar3;
            case 3:
                l lVar4 = (l) create((X1.b) obj, (p150o9.c) obj2);
                y yVar4 = y.f19095a;
                lVar4.invokeSuspend(yVar4);
                return yVar4;
            case 4:
                return ((l) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 5:
                l lVar5 = (l) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                y yVar5 = y.f19095a;
                lVar5.invokeSuspend(yVar5);
                return yVar5;
            case 6:
                return ((l) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 7:
                l lVar6 = (l) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                y yVar6 = y.f19095a;
                lVar6.invokeSuspend(yVar6);
                return yVar6;
            case 8:
                l lVar7 = (l) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                y yVar7 = y.f19095a;
                lVar7.invokeSuspend(yVar7);
                return yVar7;
            default:
                l lVar8 = (l) create((i6.g) obj, (p150o9.c) obj2);
                y yVar8 = y.f19095a;
                lVar8.invokeSuspend(yVar8);
                return yVar8;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        File parentFile;
        int i10;
        int i11 = this.f534r;
        int i12 = 2;
        int i13 = 1;
        y yVar = y.f19095a;
        Object obj2 = this.f536t;
        Object obj3 = this.f537u;
        switch (i11) {
            case 0:
                p110k9.a.e(obj);
                AbstractC0405x.x((InterfaceC0402u) this.f535s, null, new k((P) obj3, null, 0), 3);
                Object obj4 = (Context) obj2;
                U3.a aVar = obj4 instanceof U3.a ? (U3.a) obj4 : null;
                if (aVar != null) {
                    ((MainActivity) aVar).C();
                }
                return yVar;
            case 1:
                X1.e eVar = (X1.e) obj3;
                X1.b bVar = (X1.b) this.f535s;
                p110k9.a.e(obj);
                if (obj2 == null) {
                    bVar.d(eVar);
                } else {
                    bVar.getClass();
                    bVar.f(eVar, obj2);
                }
                return yVar;
            case 2:
                X1.b bVar2 = (X1.b) this.f535s;
                p110k9.a.e(obj);
                C0304b c0304b = (C0304b) obj2;
                X1.e eVar2 = c0304b.f4234c;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = new ArrayList(p120l9.n.a0(arrayList, 10));
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj5 = arrayList.get(i14);
                    i14++;
                    arrayList2.add(c0304b.f4233b.d((PreferencesBookmark) obj5));
                }
                bVar2.e(eVar2, p120l9.m.G0(arrayList2));
                return yVar;
            case 3:
                J3.d dVar = (J3.d) obj3;
                X1.e eVar3 = dVar.f4245d;
                X1.b bVar3 = (X1.b) this.f535s;
                p110k9.a.e(obj);
                PreferencesKhatmah preferencesKhatmah = (PreferencesKhatmah) obj2;
                if (preferencesKhatmah == null) {
                    bVar3.d(eVar3);
                } else {
                    bVar3.e(eVar3, dVar.f4244c.d(preferencesKhatmah));
                }
                return yVar;
            case 4:
                p150o9.c cVar = null;
                p110k9.a.e(obj);
                InterfaceC0402u interfaceC0402u = (InterfaceC0402u) this.f535s;
                z zVar = (z) obj2;
                g0 g0Var = (g0) obj3;
                AbstractC0405x.x(interfaceC0402u, null, new H(zVar, g0Var, cVar, 1), 1);
                return AbstractC0405x.x(interfaceC0402u, null, new H(zVar, g0Var, cVar, i12), 1);
            case 5:
                p110k9.a.e(obj);
                AbstractC0405x.x((InterfaceC0402u) this.f535s, null, new C0030l0((List) obj2, (A) obj3, null, 24), 3);
                return yVar;
            case 6:
                p110k9.a.e(obj);
                Context context = (Context) obj2;
                Drawable drawable = context.getResources().getDrawable(2131231025, null);
                ((p046e4.a) this.f535s).getClass();
                double d5 = 1440;
                int iU = B9.a.U(0.064d * d5);
                int iU2 = B9.a.U(d5 * 0.011d);
                int color = context.getColor(R.color.tertiary_text);
                C0532j c0532j = (C0532j) ((X4.c) obj3).f9953r;
                String string = context.getString(R.string.shared_with_ayah);
                p251z9.j.d(string, "getString(...)");
                String upperCase = string.toUpperCase(Locale.ROOT);
                p251z9.j.d(upperCase, "toUpperCase(...)");
                p251z9.j.d(Typeface.DEFAULT, "DEFAULT");
                p036d4.a aVar2 = new p036d4.a(color, 1440 * 0.022f);
                SpannableString spannableString = new SpannableString(upperCase);
                spannableString.setSpan(aVar2, 0, upperCase.length(), 17);
                TextPaint textPaint = new TextPaint(1);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                StaticLayout staticLayoutO = C0532j.o(c0532j, spannableString, textPaint, 1440, 16);
                int i15 = iU2 + iU + iU2;
                int height = staticLayoutO.getHeight() + i15 + iU2;
                drawable.setTint(color);
                drawable.setBounds(0, 0, iU, iU);
                float f3 = (1440 - iU) / 2.0f;
                float f7 = iU2;
                float width = (1440 - staticLayoutO.getWidth()) / 2.0f;
                float f10 = i15;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1440, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.translate(f3, f7);
                drawable.draw(canvas);
                canvas.translate(-f3, -f7);
                canvas.translate(width, f10);
                staticLayoutO.draw(canvas);
                canvas.translate(-width, -f10);
                return bitmapCreateBitmap;
            case 7:
                X x9 = (X) this.f535s;
                p110k9.a.e(obj);
                if (((P) obj3).f8750a.b() == EnumC0565h1.f9160t && !((Boolean) x9.getValue()).booleanValue()) {
                    x9.setValue(Boolean.TRUE);
                    Object obj6 = (Context) obj2;
                    U3.a aVar3 = obj6 instanceof U3.a ? (U3.a) obj6 : null;
                    if (aVar3 != null) {
                        ((MainActivity) aVar3).D();
                    }
                }
                return yVar;
            case 8:
                p110k9.a.e(obj);
                q qVar = (q) obj2;
                r rVar = (r) obj3;
                for (p173r2.j jVar : (Set) ((X) this.f535s).getValue()) {
                    if (!((List) qVar.b().f21459e.f6130r.getValue()).contains(jVar) && !rVar.contains(jVar)) {
                        qVar.b().c(jVar);
                    }
                }
                return yVar;
            default:
                BookType bookType = (BookType) obj3;
                s3.a aVar4 = (s3.a) obj2;
                i6.g gVar = (i6.g) this.f535s;
                p110k9.a.e(obj);
                if (gVar instanceof i6.b) {
                    s3.b bVar4 = (s3.b) ((i6.b) gVar).f16763a;
                    aVar4.getClass();
                    File file = bVar4.f22130c;
                    if (v9.g.g(file).equals("zip") && (parentFile = file.getParentFile()) != null) {
                        try {
                            R7.f fVar = Ha.a.f3643a;
                            Object[] objArr = {file, Long.valueOf(file.length())};
                            fVar.getClass();
                            R7.f.h(objArr);
                            ZipFile zipFile = new ZipFile(file, 1);
                            try {
                                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                                String canonicalPath = parentFile.getCanonicalPath();
                                long j = 0;
                                int i16 = 0;
                                while (enumerationEntries.hasMoreElements()) {
                                    i16 += i13;
                                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                                    File file2 = new File(parentFile, zipEntryNextElement.getName());
                                    String canonicalPath2 = file2.getCanonicalPath();
                                    p251z9.j.d(canonicalPath2, "getCanonicalPath(...)");
                                    p251z9.j.b(canonicalPath);
                                    if (!v.R0(canonicalPath2, canonicalPath, false)) {
                                        throw new IllegalStateException("Invalid zip file.");
                                    }
                                    if (!zipEntryNextElement.isDirectory()) {
                                        if (file2.exists()) {
                                            file2.delete();
                                        }
                                        InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                            File file3 = parentFile;
                                            try {
                                                byte[] bArr = new byte[512];
                                                Enumeration<? extends ZipEntry> enumeration = enumerationEntries;
                                                String str = canonicalPath;
                                                while (((long) 512) + j <= 524288000 && (i10 = inputStream.read(bArr)) > 0) {
                                                    fileOutputStream.write(bArr, 0, i10);
                                                    j += (long) i10;
                                                }
                                                fileOutputStream.close();
                                                o.e(inputStream, null);
                                                if (i16 >= 12000 || j >= 524288000) {
                                                    throw new IllegalStateException("Invalid zip file.");
                                                }
                                                parentFile = file3;
                                                enumerationEntries = enumeration;
                                                canonicalPath = str;
                                            } catch (Throwable th) {
                                                try {
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    o.e(fileOutputStream, th);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                throw th3;
                                            } catch (Throwable th4) {
                                                o.e(inputStream, th3);
                                                throw th4;
                                            }
                                        }
                                    } else if (!file2.exists()) {
                                        file2.mkdirs();
                                    }
                                    i13 = 1;
                                    Ha.a.f3643a.getClass();
                                    R7.f.l(new Object[0]);
                                    file.delete();
                                }
                                zipFile.close();
                                Ha.a.f3643a.getClass();
                                R7.f.h(file);
                            } catch (Throwable th5) {
                                try {
                                    throw th5;
                                } catch (Throwable th6) {
                                    o.e(zipFile, th5);
                                    throw th6;
                                }
                            }
                        } catch (IOException unused) {
                            Ha.a.f3643a.getClass();
                            R7.f.l(new Object[0]);
                        }
                        file.delete();
                    }
                    aVar4.f22126d.remove(bookType.f13685a);
                } else if (gVar instanceof i6.a) {
                    aVar4.f22126d.remove(bookType.f13685a);
                } else if ((gVar instanceof i6.d) && ((i6.d) gVar).f16772d) {
                    aVar4.f22126d.remove(bookType.f13685a);
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, p046e4.a aVar, X4.c cVar, p150o9.c cVar2) {
        super(2, cVar2);
        this.f534r = 6;
        this.f536t = context;
        this.f535s = aVar;
        this.f537u = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, Object obj3, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f534r = i10;
        this.f535s = obj;
        this.f536t = obj2;
        this.f537u = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f534r = i10;
        this.f536t = obj;
        this.f537u = obj2;
    }
}
