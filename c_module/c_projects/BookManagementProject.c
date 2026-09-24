#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>

typedef struct book
{
    int bookId;
    char bookName[50];
    char authorName[50];
    char category[30];
    float price;
    float rating;
} Book;

/* ================= COLOR ================= */

void color(int c)
{
    SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), c);
}

void line()
{
    color(8);
    printf("\n============================================================\n");
    color(7);
}

void header()
{
    system("cls");

    color(11);
    printf("\n============================================================\n");
    printf("                 BOOK MANAGEMENT SYSTEM\n");
    printf("============================================================\n");
    color(7);
}

/* ================= ADD BOOK ================= */

void addBook(Book *ptr, int size)
{
    int i;

    header();

    color(14);
    printf("\n                >>> ADD BOOK <<<\n");
    color(7);

    line();

    for(i = 0; i < size; i++)
    {
        printf("\nBook %d\n", i + 1);

        printf("Enter Book ID       : ");
        scanf("%d", &ptr[i].bookId);

        printf("Enter Book Name     : ");
        scanf(" %[^\n]", ptr[i].bookName);

        printf("Enter Author Name   : ");
        scanf(" %[^\n]", ptr[i].authorName);

        printf("Enter Category      : ");
        scanf(" %[^\n]", ptr[i].category);

        printf("Enter Price         : ");
        scanf("%f", &ptr[i].price);

        printf("Enter Rating (0-5)  : ");
        scanf("%f", &ptr[i].rating);

        line();
    }

    color(10);
    printf("\nBook Added Successfully!\n");
    color(7);
}

/* ================= DISPLAY ================= */

void display(Book *ptr, int size)
{
    int i;

    header();

    color(14);
    printf("\n                    >>> ALL BOOKS <<<\n");
    color(7);

    if(size == 0)
    {
        color(12);
        printf("\nNo Books Available!\n");
        color(7);
        return;
    }

    for(i = 0; i < size; i++)
    {
        line();

        color(11);
        printf("Book #%d\n", i + 1);
        color(7);

        printf("Book ID       : %d\n", ptr[i].bookId);
        printf("Book Name     : %s\n", ptr[i].bookName);
        printf("Author Name   : %s\n", ptr[i].authorName);
        printf("Category      : %s\n", ptr[i].category);
        printf("Price         : Rs. %.2f\n", ptr[i].price);
        printf("Rating        : %.1f / 5.0\n", ptr[i].rating);
    }

    line();
}

/* ================= SEARCH BY ID ================= */

void searchById(Book *ptr, int size)
{
    int id, i, flag = 0;

    header();

    color(14);
    printf("\n                 >>> SEARCH BY ID <<<\n");
    color(7);

    line();

    printf("Enter Book ID : ");
    scanf("%d", &id);

    for(i = 0; i < size; i++)
    {
        if(ptr[i].bookId == id)
        {
            flag = 1;

            color(10);
            printf("\nBook Found Successfully!\n");
            color(7);

            line();

            printf("Book ID       : %d\n", ptr[i].bookId);
            printf("Book Name     : %s\n", ptr[i].bookName);
            printf("Author        : %s\n", ptr[i].authorName);
            printf("Category      : %s\n", ptr[i].category);
            printf("Price         : Rs. %.2f\n", ptr[i].price);
            printf("Rating        : %.1f / 5.0\n", ptr[i].rating);

            break;
        }
    }

    if(flag == 0)
    {
        color(12);
        printf("\nBook Not Found!\n");
        color(7);
    }
}

/* ================= SEARCH BY NAME ================= */

void searchByName(Book *ptr, int size)
{
    char name[50];
    int i, flag = 0;

    header();

    color(14);
    printf("\n                >>> SEARCH BY NAME <<<\n");
    color(7);

    line();

    printf("Enter Book Name : ");
    scanf(" %[^\n]", name);

    for(i = 0; i < size; i++)
    {
        if(strcasecmp(ptr[i].bookName, name) == 0)
        {
            flag = 1;

            color(10);
            printf("\nBook Found!\n");
            color(7);

            line();

            printf("Book ID       : %d\n", ptr[i].bookId);
            printf("Book Name     : %s\n", ptr[i].bookName);
            printf("Author        : %s\n", ptr[i].authorName);
            printf("Category      : %s\n", ptr[i].category);
            printf("Price         : Rs. %.2f\n", ptr[i].price);
            printf("Rating        : %.1f / 5.0\n", ptr[i].rating);
        }
    }

    if(flag == 0)
    {
        color(12);
        printf("\nBook Not Found!\n");
        color(7);
    }
}

/* ================= AUTHOR BOOKS ================= */

void authorBooks(Book *ptr, int size)
{
    char author[50];
    int i, flag = 0;

    header();

    color(14);
    printf("\n                 >>> AUTHOR BOOKS <<<\n");
    color(7);

    line();

    printf("Enter Author Name : ");
    scanf(" %[^\n]", author);

    for(i = 0; i < size; i++)
    {
        if(strcmp(ptr[i].authorName, author) == 0)
        {
            flag = 1;

            printf("\nBook Name : %s\n", ptr[i].bookName);
            printf("Price     : Rs. %.2f\n", ptr[i].price);
            printf("Rating    : %.1f / 5.0\n", ptr[i].rating);

            line();
        }
    }

    if(flag == 0)
    {
        color(12);
        printf("\nNo Books Found For This Author!\n");
        color(7);
    }
}

/* ================= CATEGORY BOOKS ================= */

void categoryBooks(Book *ptr, int size)
{
    char cat[30];
    int i, flag = 0;

    header();

    color(14);
    printf("\n                >>> CATEGORY BOOKS <<<\n");
    color(7);

    line();

    printf("Enter Category : ");
    scanf(" %[^\n]", cat);

    for(i = 0; i < size; i++)
    {
        if(strcmp(ptr[i].category, cat) == 0)
        {
            flag = 1;

            printf("\nBook Name : %s\n", ptr[i].bookName);
            printf("Author    : %s\n", ptr[i].authorName);
            printf("Price     : Rs. %.2f\n", ptr[i].price);

            line();
        }
    }

    if(flag == 0)
    {
        color(12);
        printf("\nNo Books Found In This Category!\n");
        color(7);
    }
}

/* ================= UPDATE ================= */

void update(Book *ptr, int size)
{
    int id, i;

    header();

    color(14);
    printf("\n                  >>> UPDATE BOOK <<<\n");
    color(7);

    line();

    printf("Enter Book ID : ");
    scanf("%d", &id);

    for(i = 0; i < size; i++)
    {
        if(ptr[i].bookId == id)
        {
            printf("\nEnter New Price  : ");
            scanf("%f", &ptr[i].price);

            printf("Enter New Rating : ");
            scanf("%f", &ptr[i].rating);

            color(10);
            printf("\nBook Updated Successfully!\n");
            color(7);

            return;
        }
    }

    color(12);
    printf("\nBook Not Found!\n");
    color(7);
}

/* ================= REMOVE ================= */

void removeBook(Book *ptr, int *size)
{
    int id, i, j;

    header();

    color(14);
    printf("\n                  >>> REMOVE BOOK <<<\n");
    color(7);

    line();

    printf("Enter Book ID : ");
    scanf("%d", &id);

    for(i = 0; i < *size; i++)
    {
        if(ptr[i].bookId == id)
        {
            for(j = i; j < *size - 1; j++)
            {
                ptr[j] = ptr[j + 1];
            }

            (*size)--;

            color(10);
            printf("\nBook Deleted Successfully!\n");
            color(7);

            return;
        }
    }

    color(12);
    printf("\nBook Not Found!\n");
    color(7);
}

/* ================= SORT PRICE ================= */

void sortPrice(Book *ptr, int size)
{
    int i, j;
    Book temp;

    for(i = 0; i < size - 1; i++)
    {
        for(j = i + 1; j < size; j++)
        {
            if(ptr[i].price > ptr[j].price)
            {
                temp = ptr[i];
                ptr[i] = ptr[j];
                ptr[j] = temp;
            }
        }
    }

    header();

    color(10);
    printf("\nBooks Sorted By Price Successfully!\n");
    color(7);

    display(ptr, size);
}

/* ================= SORT RATING ================= */

void sortRating(Book *ptr, int size)
{
    int i, j;
    Book temp;

    for(i = 0; i < size - 1; i++)
    {
        for(j = i + 1; j < size; j++)
        {
            if(ptr[i].rating < ptr[j].rating)
            {
                temp = ptr[i];
                ptr[i] = ptr[j];
                ptr[j] = temp;
            }
        }
    }

    header();

    color(10);
    printf("\nBooks Sorted By Rating Successfully!\n");
    color(7);

    display(ptr, size);
}

/* ================= MAIN ================= */

int main()
{
    int choice;
    int size = 3;

    Book *ptr = malloc(size * sizeof(Book));

    if(ptr == NULL)
    {
        printf("Memory Allocation Failed!\n");
        return 1;
    }

    /* Default Books */

    ptr[0].bookId = 101;
    strcpy(ptr[0].bookName, "C Programming");
    strcpy(ptr[0].authorName, "Dennis Ritchie");
    strcpy(ptr[0].category, "Programming");
    ptr[0].price = 450.50;
    ptr[0].rating = 4.8;

    ptr[1].bookId = 102;
    strcpy(ptr[1].bookName, "Data Structures");
    strcpy(ptr[1].authorName, "Mark Weiss");
    strcpy(ptr[1].category, "Computer Science");
    ptr[1].price = 550.00;
    ptr[1].rating = 4.5;

    ptr[2].bookId = 103;
    strcpy(ptr[2].bookName, "Operating System Concepts");
    strcpy(ptr[2].authorName, "Silberschatz");
    strcpy(ptr[2].category, "Computer Science");
    ptr[2].price = 600.75;
    ptr[2].rating = 4.7;

    do
    {
        header();

        color(11);
        printf("\n                    MAIN MENU\n");
        color(7);

        line();

        printf("\n");
        color(10);
        printf("  [1] ");
        color(7);
        printf("Add Book");

        color(10);
        printf("\n  [2] ");
        color(7);
        printf("Display All Books");

        color(10);
        printf("\n  [3] ");
        color(7);
        printf("Search Book By ID");

        color(10);
        printf("\n  [4] ");
        color(7);
        printf("Search Book By Name");

        color(10);
        printf("\n  [5] ");
        color(7);
        printf("Show Author Books");

        color(10);
        printf("\n  [6] ");
        color(7);
        printf("Show Category Books");

        color(10);
        printf("\n  [7] ");
        color(7);
        printf("Update Book");

        color(10);
        printf("\n  [8] ");
        color(7);
        printf("Remove Book");

        color(10);
        printf("\n  [9] ");
        color(7);
        printf("Sort By Price");

        color(10);
        printf("\n  [10]");
        color(7);
        printf(" Sort By Rating");

        color(12);
        printf("\n  [0] ");
        color(7);
        printf("Exit");

        line();

        printf("\nEnter Your Choice : ");
        scanf("%d", &choice);

        switch(choice)
        {
            case 1:
            {
                int newBooks;

                printf("\nHow many books do you want to add? ");
                scanf("%d", &newBooks);

                if(newBooks <= 0)
                {
                    color(12);
                    printf("\nInvalid Number Of Books!\n");
                    color(7);
                    break;
                }

                Book *temp;

                temp = realloc(ptr, (size + newBooks) * sizeof(Book));

                if(temp == NULL)
                {
                    color(12);
                    printf("\nMemory Reallocation Failed!\n");
                    color(7);
                    break;
                }

                ptr = temp;

                addBook(ptr + size, newBooks);

                size = size + newBooks;

                break;
            }

            case 2:
                display(ptr, size);
                break;

            case 3:
                searchById(ptr, size);
                break;

            case 4:
                searchByName(ptr, size);
                break;

            case 5:
                authorBooks(ptr, size);
                break;

            case 6:
                categoryBooks(ptr, size);
                break;

            case 7:
                update(ptr, size);
                break;

            case 8:
                removeBook(ptr, &size);
                break;

            case 9:
                sortPrice(ptr, size);
                break;

            case 10:
                sortRating(ptr, size);
                break;

            case 0:
                color(11);
                printf("\n\nThank You For Using Book Management System!\n");
                color(7);
                break;

            default:
                color(12);
                printf("\nInvalid Choice! Please Try Again.\n");
                color(7);
        }

        if(choice != 0)
        {
            printf("\n\nPress ENTER to continue...");
            getchar();
            getchar();
        }

    } while(choice != 0);

    free(ptr);

    return 0;
}