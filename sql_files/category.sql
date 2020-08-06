USE [Supermarket]
GO

/****** Object:  Table [dbo].[Category]    Script Date: 8/1/2020 12:19:31 AM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Category]') AND type in (N'U'))
DROP TABLE [dbo].[Category]
GO

/****** Object:  Table [dbo].[Category]    Script Date: 8/1/2020 12:19:31 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[category](
	[category_Id] [int]identity(1,1) NOT NULL,
	[name] [varchar](30) NOT NULL,
	[description] [varchar](100) NOT NULL,
	[image] [image]  NULL,
	[store_Id] [int] NOT NULL,
	[createdat] [varchar](50)  NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[Category_Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO


