package D3;

import Da.A;
import Da.d;
import Da.s;
import Da.t;
import G.V;
import H9.v;
import K0.InterfaceC0340e;
import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import N9.k0;
import R7.f;
import T8.g;
import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.ayah.AyahApplication;
import com.ayah.MainActivity;
import com.ayah.common.data.source.database.AyahDatabase;
import com.ayah.common.data.source.json.model.booklist.BookCategory;
import com.ayah.common.data.source.json.model.booklist.BookType;
import com.ayah.dao.backup.BackupData;
import com.ayah.dao.backup.Favorite;
import com.ayah.dao.backup.Note;
import com.ayah.dao.realm.factory.RealmUtils;
import com.ayah.dao.realm.model.audio.Reciter;
import com.ayah.note.NoteActivity;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.o;
import com.squareup.moshi.q;
import com.squareup.moshi.z;
import io.realm.Realm;
import io.realm.RealmResults;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p035d3.u;
import p110k9.y;
import p120l9.n;
import p120l9.r;
import p120l9.w;
import p144o3.h;
import p162q0.p;
import p241y9.e;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1166r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1167s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f1166r = i10;
        this.f1167s = obj;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f1166r) {
            case 0:
                return new b((c) this.f1167s, cVar, 0);
            case 1:
                return new b((MainActivity) this.f1167s, cVar, 1);
            case 2:
                return new b((p) this.f1167s, cVar, 2);
            case 3:
                return new b((g) this.f1167s, cVar, 3);
            case 4:
                return new b((InterfaceC0340e) this.f1167s, cVar, 4);
            case 5:
                return new b((AyahApplication) this.f1167s, cVar, 5);
            case 6:
                return new b((NoteActivity) this.f1167s, cVar, 6);
            case 7:
                return new b((h) this.f1167s, cVar, 7);
            default:
                return new b((Context) this.f1167s, cVar, 8);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        switch (this.f1166r) {
            case 0:
                return ((b) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 1:
                b bVar = (b) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                y yVar = y.f19095a;
                bVar.invokeSuspend(yVar);
                return yVar;
            case 2:
                b bVar2 = (b) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                y yVar2 = y.f19095a;
                bVar2.invokeSuspend(yVar2);
                return yVar2;
            case 3:
                return ((b) create((g) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            case 4:
                b bVar3 = (b) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                y yVar3 = y.f19095a;
                bVar3.invokeSuspend(yVar3);
                return yVar3;
            case 5:
                b bVar4 = (b) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                y yVar4 = y.f19095a;
                bVar4.invokeSuspend(yVar4);
                return yVar4;
            case 6:
                b bVar5 = (b) create((InterfaceC0402u) obj, (p150o9.c) obj2);
                y yVar5 = y.f19095a;
                bVar5.invokeSuspend(yVar5);
                return yVar5;
            case 7:
                return ((b) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
            default:
                return ((b) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01d9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws IOException {
        File[] fileArrListFiles;
        int i10 = 2;
        Uri uriD = null;
        Object[] objArr = 0;
        int i11 = 1;
        int i12 = 0;
        switch (this.f1166r) {
            case 0:
                p110k9.a.e(obj);
                c cVar = (c) this.f1167s;
                InputStream inputStreamOpen = cVar.f1168a.getAssets().open("books/books.json");
                try {
                    j.b(inputStreamOpen);
                    t tVarP = Y2.a.p(new d(i11, inputStreamOpen, new A()));
                    try {
                        Object value = cVar.f1169b.getValue();
                        j.d(value, "getValue(...)");
                        Iterable<BookCategory> iterable = (List) ((JsonAdapter) value).a(new o(tVarP));
                        if (iterable == null) {
                            iterable = r.f19440r;
                        }
                        ArrayList arrayList = new ArrayList(n.a0(iterable, 10));
                        for (BookCategory bookCategory : iterable) {
                            List list = bookCategory.f13683c;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list) {
                                if (!((BookType) obj2).f13690f) {
                                    arrayList2.add(obj2);
                                }
                            }
                            String str = bookCategory.f13681a;
                            String str2 = bookCategory.f13682b;
                            String str3 = bookCategory.f13684d;
                            j.e(str2, "title");
                            arrayList.add(new BookCategory(str, str2, str3, arrayList2));
                        }
                        int iG0 = w.g0(n.a0(arrayList, 10));
                        if (iG0 < 16) {
                            iG0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
                        int size = arrayList.size();
                        while (i12 < size) {
                            Object obj3 = arrayList.get(i12);
                            i12++;
                            linkedHashMap.put(((BookCategory) obj3).f13681a, obj3);
                        }
                        tVarP.close();
                        inputStreamOpen.close();
                        cVar.f1170c.set(linkedHashMap);
                        return linkedHashMap;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            p181s2.o.e(tVarP, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        p181s2.o.e(inputStreamOpen, th3);
                        throw th4;
                    }
                }
            case 1:
                p110k9.a.e(obj);
                ((MainActivity) this.f1167s).C();
                return y.f19095a;
            case 2:
                p110k9.a.e(obj);
                p.b((p) this.f1167s);
                return y.f19095a;
            case 3:
                p110k9.a.e(obj);
                return (g) this.f1167s;
            case 4:
                p110k9.a.e(obj);
                return y.f19095a;
            case 5:
                p110k9.a.e(obj);
                AyahApplication ayahApplication = (AyahApplication) this.f1167s;
                File file = new File(ayahApplication.getDir("fonts", 0), "fonts");
                if (file.exists()) {
                    v9.g.f(file);
                }
                File filesDir = ayahApplication.getFilesDir();
                if (filesDir == null || (fileArrListFiles = filesDir.listFiles()) == null) {
                    fileArrListFiles = new File[0];
                }
                ArrayList arrayList3 = new ArrayList();
                for (File file2 : fileArrListFiles) {
                    String name = file2.getName();
                    j.d(name, "getName(...)");
                    if (v.R0(name, "quotes", false)) {
                        arrayList3.add(file2);
                    } else {
                        String name2 = file2.getName();
                        j.d(name2, "getName(...)");
                        if (v.R0(name2, "en_quotes", false)) {
                            arrayList3.add(file2);
                        }
                    }
                }
                int size2 = arrayList3.size();
                while (i12 < size2) {
                    Object obj4 = arrayList3.get(i12);
                    i12++;
                    ((File) obj4).delete();
                }
                return y.f19095a;
            case 6:
                p110k9.a.e(obj);
                NoteActivity noteActivity = (NoteActivity) this.f1167s;
                p074h0.i iVar = noteActivity.f13918h0;
                if (iVar == null) {
                    j.k("notesPresenter");
                    throw null;
                }
                int i13 = noteActivity.f13913c0;
                P9.d dVar = (P9.d) iVar.f16424u;
                R9.e eVar = H.f5322a;
                AbstractC0405x.x(dVar, R9.d.f7436t, new V(i13, 3, iVar, objArr == true ? 1 : 0), 2);
                return y.f19095a;
            case 7:
                p110k9.a.e(obj);
                Realm audioDatabase = RealmUtils.getAudioDatabase();
                h hVar = (h) this.f1167s;
                try {
                    RealmResults<Reciter> realmResultsFindAll = audioDatabase.where(Reciter.class).equalTo("isPrivate", Boolean.FALSE).findAll();
                    j.b(realmResultsFindAll);
                    ArrayList arrayList4 = new ArrayList(n.a0(realmResultsFindAll, 10));
                    for (Reciter reciter : realmResultsFindAll) {
                        j.b(reciter);
                        arrayList4.add(f.o(reciter, false, false));
                    }
                    k0 k0Var = hVar.f20329b;
                    k0Var.getClass();
                    k0Var.n(null, arrayList4);
                    audioDatabase.close();
                    return arrayList4;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        p181s2.o.e(audioDatabase, th5);
                        throw th6;
                    }
                }
            default:
                p110k9.a.e(obj);
                Context applicationContext = ((Context) this.f1167s).getApplicationContext();
                j.d(applicationContext, "getApplicationContext(...)");
                AyahDatabase ayahDatabase = (AyahDatabase) ((u) ((C3.b) p000a.a.G(applicationContext, C3.b.class))).f15679w.get();
                List list2 = (List) B9.a.Q(ayahDatabase.l().f495a, true, false, new A3.d(i12));
                j.e(list2, "input");
                ArrayList arrayList5 = new ArrayList(n.a0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList5.add(new Favorite(((E3.b) it.next()).f1839b));
                }
                List<E3.c> list3 = (List) B9.a.Q(ayahDatabase.m().f497a, true, false, new A3.d(i10));
                j.e(list3, "input");
                ArrayList arrayList6 = new ArrayList(n.a0(list3, 10));
                for (E3.c cVar2 : list3) {
                    arrayList6.add(new Note(cVar2.f1842b, cVar2.f1843c));
                }
                p147o6.a aVar = p147o6.a.f20333a;
                Context context = (Context) this.f1167s;
                BackupData backupData = new BackupData(arrayList5, arrayList6);
                synchronized (aVar) {
                    try {
                        File file3 = new File(context.getExternalFilesDir(null), "backups");
                        if (!file3.exists()) {
                            file3.mkdirs();
                        }
                        File file4 = new File(file3, "ayah_backup.ayah");
                        JsonAdapter jsonAdapterA = new C(new z(0)).a(BackupData.class);
                        s sVarO = Y2.a.o(new Da.c(i11, new FileOutputStream(file4, false), new A()));
                        jsonAdapterA.e(new q(sVarO), backupData);
                        sVarO.close();
                        uriD = FileProvider.d(context, "com.ayah.fileprovider", file4);
                        break;
                    } catch (Exception unused) {
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                return uriD;
        }
    }
}
