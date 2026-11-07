package B3;

import F2.q;
import H9.o;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.ayah.common.data.source.database.BookDatabase;
import com.ayah.common.data.source.json.model.booklist.BookType;
import java.io.File;
import java.util.Collection;
import java.util.LinkedHashMap;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p166q4.a f610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f611c;

    public e(Context context, p166q4.a aVar) {
        j.e(aVar, "crashLogger");
        this.f609a = context;
        this.f610b = aVar;
        this.f611c = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(BookDatabase bookDatabase, q9.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f602t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f602t = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objR = cVar2.f600r;
        int i11 = cVar2.f602t;
        boolean z10 = false;
        int i12 = 1;
        try {
            if (i11 == 0) {
                p110k9.a.e(objR);
                A3.c cVarL = bookDatabase.l();
                cVar2.f602t = 1;
                objR = B9.a.R(cVarL.f489a, true, false, new A3.b(i12, cVarL), cVar2);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objR == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(objR);
            }
            z10 = !((Collection) objR).isEmpty();
        } catch (Exception e10) {
            Log.e("BookDatabaseFactory", "isValid opening exception", e10);
            this.f610b.b(e10);
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x011e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0138  */
    /* JADX WARN: Code duplicated, block: B:46:0x0146  */
    /* JADX WARN: Code duplicated, block: B:48:0x0156 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x011e, please report this as an issue */
    public final Object b(BookType bookType, q9.c cVar) {
        d dVar;
        int i10;
        boolean zExists;
        p166q4.a aVar;
        BookDatabase bookDatabase;
        File file;
        BookDatabase bookDatabase2;
        Object obj;
        BookType bookType2 = bookType;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i11 = dVar.f608w;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f608w = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objA = dVar.f606u;
        int i12 = dVar.f608w;
        Context context = this.f609a;
        LinkedHashMap linkedHashMap = this.f611c;
        if (i12 == 0) {
            p110k9.a.e(objA);
            BookDatabase bookDatabase3 = (BookDatabase) linkedHashMap.get(bookType2);
            if (bookDatabase3 != null) {
                return bookDatabase3;
            }
            int i13 = 0;
            i10 = (context.getDatabasePath(p050e8.b.o(bookType2)).exists() || !new File(context.getFilesDir(), p050e8.b.o(bookType2)).exists()) ? 0 : 1;
            String strO = p050e8.b.o(bookType2);
            String str = bookType2.f13685a;
            q qVarB = A3.f.b(context, BookDatabase.class, strO);
            if (!context.getDatabasePath(p050e8.b.o(bookType2)).exists()) {
                String[] list = context.getAssets().list("databases");
                if (list != null) {
                    int length = list.length;
                    while (true) {
                        if (i13 < length) {
                            if (j.a(list[i13], str + ".db")) {
                                String str2 = "databases/" + str + ".db";
                                j.e(str2, "databaseFilePath");
                                qVarB.f2311o = str2;
                                bookDatabase2 = (BookDatabase) qVarB.a();
                            } else {
                                i13++;
                            }
                        } else {
                            zExists = new File(context.getFilesDir(), p050e8.b.o(bookType2)).exists();
                            aVar = this.f610b;
                            if (zExists) {
                                file = new File(context.getFilesDir(), strO);
                                if (file.exists()) {
                                    try {
                                        qVarB.f2312p = file;
                                        bookDatabase2 = (BookDatabase) qVarB.a();
                                    } catch (Exception e10) {
                                        Log.e("BookDatabaseFactory", "Error creating database from file: ".concat(strO), e10);
                                        aVar.b(e10);
                                        bookDatabase2 = null;
                                    }
                                } else {
                                    aVar.a("Database not found for " + o.k1(strO, ".db") + ", despite marked as downloaded.");
                                }
                            } else {
                                aVar.a("Database not found for ".concat(o.k1(strO, ".db")));
                            }
                            bookDatabase = null;
                        }
                    }
                } else {
                    zExists = new File(context.getFilesDir(), p050e8.b.o(bookType2)).exists();
                    aVar = this.f610b;
                    if (zExists) {
                        file = new File(context.getFilesDir(), strO);
                        if (file.exists()) {
                            qVarB.f2312p = file;
                            bookDatabase2 = (BookDatabase) qVarB.a();
                        } else {
                            aVar.a("Database not found for " + o.k1(strO, ".db") + ", despite marked as downloaded.");
                        }
                    } else {
                        aVar.a("Database not found for ".concat(o.k1(strO, ".db")));
                    }
                    bookDatabase = null;
                }
                if (bookDatabase != null) {
                    dVar.f603r = bookType2;
                    dVar.f604s = bookDatabase;
                    dVar.f605t = i10;
                    dVar.f608w = 1;
                    objA = a(bookDatabase, dVar);
                    obj = p161p9.a.f21156r;
                    if (objA == obj) {
                        return obj;
                    }
                }
                return null;
            }
            bookDatabase2 = (BookDatabase) qVarB.a();
            bookDatabase = bookDatabase2;
            if (bookDatabase != null) {
                dVar.f603r = bookType2;
                dVar.f604s = bookDatabase;
                dVar.f605t = i10;
                dVar.f608w = 1;
                objA = a(bookDatabase, dVar);
                obj = p161p9.a.f21156r;
                if (objA == obj) {
                    return obj;
                }
            }
            return null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i14 = dVar.f605t;
        bookDatabase = dVar.f604s;
        BookType bookType3 = dVar.f603r;
        p110k9.a.e(objA);
        i10 = i14;
        bookType2 = bookType3;
        if (((Boolean) objA).booleanValue()) {
            if (i10 != 0) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                j.b(defaultSharedPreferences);
                SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
                editorEdit.putBoolean("shouldCleanupOldFiles", true);
                editorEdit.apply();
            }
            linkedHashMap.put(bookType2, bookDatabase);
            return bookDatabase;
        }
        return null;
    }
}
